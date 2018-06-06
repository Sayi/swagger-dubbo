package com.deepoove.swagger.dubbo.http;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.deepoove.swagger.dubbo.api.InterfaceServiceImplTest;
import com.deepoove.swagger.dubbo.api.InterfaceServiceTest;


public class HttpMatchTest {
	
	HttpMatch httpMatch = new HttpMatch(InterfaceServiceTest.class, InterfaceServiceImplTest.class);
	
	@Test
	public void testFindInterfaceMethods(){
		Method[] findInterfaceMethods = httpMatch.findInterfaceMethods("login");
		Assert.assertEquals(findInterfaceMethods.length, 2);
		
		findInterfaceMethods = httpMatch.findInterfaceMethods("get");
        Assert.assertEquals(findInterfaceMethods.length, 2);
		
		findInterfaceMethods = httpMatch.findInterfaceMethods("test");
        Assert.assertEquals(findInterfaceMethods.length, 1);
		
	}
	
	@Test
	public void testFindRefMethods() throws NoSuchMethodException, SecurityException{
		Method[] findInterfaceMethods = httpMatch.findInterfaceMethods("login");
		Assert.assertEquals(findInterfaceMethods.length, 2);
		
		Method[] findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, null, "POST");
		Assert.assertEquals(findRefMethods.length, 1);
		Assert.assertEquals(findRefMethods[0], InterfaceServiceImplTest.class.getDeclaredMethod("login", String.class));
		
		findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, "bypwd", "POST");
		Assert.assertEquals(findRefMethods.length, 1);
		Assert.assertEquals(findRefMethods[0], InterfaceServiceImplTest.class.getDeclaredMethod("login", String.class, String.class));
		
		findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, "other", "POST");
		Assert.assertEquals(findRefMethods.length, 0);
		
		findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, null, "GET");
		Assert.assertEquals(findRefMethods.length, 0);
		
		findInterfaceMethods = httpMatch.findInterfaceMethods("get");
        Assert.assertEquals(findInterfaceMethods.length, 2);
        findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, null, "POST");
        Assert.assertEquals(findRefMethods.length, 2);
	}
	
	@Test
    public void testMatchRefMethods() throws NoSuchMethodException, SecurityException{
	    Method[] findInterfaceMethods = httpMatch.findInterfaceMethods("get");
	    Method[] findRefMethods = httpMatch.findRefMethods(findInterfaceMethods, null, "POST");
	    Set<String> params = new HashSet<String>();
	    params.add("name");
	    params.add("phone");
        Method matchRefMethod = httpMatch.matchRefMethod(findRefMethods, "get", params);
        Assert.assertEquals(matchRefMethod, InterfaceServiceImplTest.class.getDeclaredMethod("get", String.class, String.class));
        
        params = new HashSet<String>();
        params.add("id");
        matchRefMethod = httpMatch.matchRefMethod(findRefMethods, "get", params);
        Assert.assertEquals(matchRefMethod, InterfaceServiceImplTest.class.getDeclaredMethod("get", String.class));
	} 
	

}
