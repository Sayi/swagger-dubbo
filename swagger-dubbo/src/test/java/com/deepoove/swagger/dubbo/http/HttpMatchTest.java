package com.deepoove.swagger.dubbo.http;

import java.lang.reflect.Method;

import org.junit.Test;

import com.deepoove.swagger.dubbo.api.InterfaceServiceImplTest;
import com.deepoove.swagger.dubbo.api.InterfaceServiceTest;

import junit.framework.Assert;

public class HttpMatchTest {
	
	HttpMatch httpMatch = new HttpMatch(InterfaceServiceTest.class, InterfaceServiceImplTest.class);
	
	@Test
	public void testFindInterfaceMethods(){
		Method[] findInterfaceMethods = httpMatch.findInterfaceMethods("login");
		Assert.assertEquals(findInterfaceMethods.length, 2);
		
	}
	@Test
	public void testFindRefMethods(){
		Method[] findInterfaceMethods = httpMatch.findInterfaceMethods("login");
		Assert.assertEquals(findInterfaceMethods.length, 2);
		
		Method[] findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, null, "POST");
		Assert.assertEquals(findRefMethods.length, 1);
		
		findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, "bypwd", "POST");
		Assert.assertEquals(findRefMethods.length, 1);
		
		findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, "other", "POST");
		Assert.assertEquals(findRefMethods.length, 0);
		
		findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, null, "GET");
		Assert.assertEquals(findRefMethods.length, 0);
	}
	

}
