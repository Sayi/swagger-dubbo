package com.deepoove.swagger.dubbo.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.deepoove.swagger.dubbo.config.DubboPropertyConfig;
import com.deepoove.swagger.dubbo.config.DubboServiceScanner;
import com.deepoove.swagger.dubbo.config.SwaggerDocCache;
import com.deepoove.swagger.dubbo.reader.Reader;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.annotations.Api;
import io.swagger.config.SwaggerConfig;
import io.swagger.models.Swagger;
import io.swagger.util.Json;

@Controller
@RequestMapping("${swagger.dubbo.doc:swagger-dubbo}")
@Api(hidden = true)
public class SwaggerDubboController {

	@Autowired
	private DubboServiceScanner dubboServiceScanner;
	@Autowired
	private DubboPropertyConfig dubboPropertyConfig;
	@Autowired
	private SwaggerDocCache swaggerDocCache;

	@Value("${swagger.dubbo.http:h}")
	private String httpContext;
	@Value("${swagger.dubbo.enable:true}")
	private boolean enable = true;

	@RequestMapping(value = "/swagger.json", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ResponseBody
	public ResponseEntity<String> getApiList() throws JsonProcessingException {
		
		if (!enable){
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		
		Swagger swagger = swaggerDocCache.getSwagger();
		if (null != swagger){
			return new ResponseEntity<String>(Json.mapper().writeValueAsString(swagger), HttpStatus.OK);
		}else{
			swagger = new Swagger();
		}

		final SwaggerConfig configurator = dubboPropertyConfig;
		if (configurator != null) {
			configurator.configure(swagger);
		}

		Map<Class<?>, Object> interfaceMapRef = dubboServiceScanner.interfaceMapRef();
		if (null != interfaceMapRef) {
			Reader.read(swagger, interfaceMapRef, httpContext);
		}
		swaggerDocCache.setSwagger(swagger);
		return new ResponseEntity<String>(Json.mapper().writeValueAsString(swagger), HttpStatus.OK);
	}

}
