package com.deepoove.swagger.dubbo.reader;

import org.junit.Assert;
import org.junit.Test;

import com.deepoove.swagger.dubbo.api.InterfaceServiceImplTest;

public  class NameDiscoverTest {
    
    @Test
    public void testGetParamName() throws NoSuchMethodException, SecurityException{
        String[] parameterNames = NameDiscover.parameterNameDiscover.getParameterNames(InterfaceServiceImplTest.class.getDeclaredMethod("login", String.class, String.class));
        Assert.assertArrayEquals(parameterNames, new String[]{"name", "password"});
    }

    

}
