package com.deepoove.swagger.dubbo.json;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.mock.http.MockHttpOutputMessage;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

import springfox.documentation.spring.web.json.Json;

public class FastJsonHttpMessageConverterTest {
    
    @Test
    public void testSwagger() throws HttpMessageNotWritableException, IOException{
        Json value = new Json("{\"swagger\":\"2.0\"");
        HttpOutputMessage outMessage = new MockHttpOutputMessage(){
            
            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders httpHeaders = new HttpHeaders();
                httpHeaders.setContentType(MediaType.APPLICATION_JSON);
                return httpHeaders;
            }
        };
        new FastJsonHttpMessageConverter().write(value, null, outMessage);
        Assert.assertTrue((outMessage.getBody().toString().startsWith("{\"swagger\":\"2.0\"")));
    }

}
