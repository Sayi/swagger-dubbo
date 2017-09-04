package com.deepoove.swagger.dubbo.reader;

import java.util.HashMap;
import java.util.List;

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
		
		Path path = swagger.getPaths().get("/h/com.deepoove.swagger.dubbo.api.InterfaceServiceTest/test");
		Assert.assertNotNull(path);
		Operation operation = path.getOperationMap().get(HttpMethod.POST);
		Assert.assertNotNull(operation);
		Assert.assertNotNull(operation.getParameters());
		
		List<Parameter> parameters = operation.getParameters();
		Assert.assertTrue(parameters.get(0).getName().equals("para"));
		Assert.assertTrue(parameters.get(1).getName().equals("code"));
		
	}

}
