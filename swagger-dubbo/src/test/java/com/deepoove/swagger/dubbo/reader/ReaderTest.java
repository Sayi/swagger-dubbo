package com.deepoove.swagger.dubbo.reader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.deepoove.swagger.dubbo.api.InterfaceServiceImplTest;
import com.deepoove.swagger.dubbo.api.InterfaceServiceTest;

import io.swagger.models.HttpMethod;
import io.swagger.models.Operation;
import io.swagger.models.Path;
import io.swagger.models.Swagger;
import io.swagger.models.parameters.Parameter;

public class ReaderTest {
	
	
	@SuppressWarnings({  "serial" })
	@Test
	public void testApplyParameters(){
		Swagger swagger = new Swagger();
		Reader.read(swagger, new HashMap<Class<?>, Object>(){{
			put(InterfaceServiceTest.class, new InterfaceServiceImplTest());
		}}, "/h");
		
//		System.out.println(Json.pretty(swagger));
		Map<String, Path> paths = swagger.getPaths();
		Assert.assertEquals(paths.size(), 4);
		
		Path path = swagger.getPaths().get("/h/com.deepoove.swagger.dubbo.api.InterfaceServiceTest/test");
		Assert.assertNotNull(path);
		Operation operation = path.getOperationMap().get(HttpMethod.POST);
		Assert.assertNotNull(operation);
		Assert.assertNotNull(operation.getParameters());
		Assert.assertEquals(operation.getSummary(), "查询用户");
		
		List<Parameter> parameters = operation.getParameters();
		Assert.assertEquals(parameters.get(0).getName(), "para");
		Assert.assertEquals(parameters.get(1).getName(), "code");
		
		Assert.assertTrue(parameters.get(0).getRequired());
		Assert.assertEquals(parameters.get(0).getDescription(), "参数");
		
		
		path = swagger.getPaths().get("/h/com.deepoove.swagger.dubbo.api.InterfaceServiceTest/login/bypwd");
        Assert.assertNotNull(path);
        path = swagger.getPaths().get("/h/com.deepoove.swagger.dubbo.api.InterfaceServiceTest/login");
        Assert.assertNotNull(path);
		
	}

}
