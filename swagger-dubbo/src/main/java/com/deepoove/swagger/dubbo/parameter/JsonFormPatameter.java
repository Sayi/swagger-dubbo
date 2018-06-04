package com.deepoove.swagger.dubbo.parameter;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.models.Model;
import io.swagger.models.parameters.FormParameter;

/** 
 * @Description 
 * @author huangjinkai
 * @date 2018年6月2日 下午5:30:55 
 */

public class JsonFormPatameter extends FormParameter {
	  	Model schema;
	    Map<String, String> examples;

	    public JsonFormPatameter() {
	    	//使用query以确保参数被存放在url当中
	        super.setIn("query");
	    }

	    public JsonFormPatameter schema(Model schema) {
	        this.setSchema(schema);
	        return this;
	    }

	    public JsonFormPatameter example(String mediaType, String value) {
	        this.addExample(mediaType, value);
	        return this;
	    }

	    public JsonFormPatameter description(String description) {
	        this.setDescription(description);
	        return this;
	    }

	    public JsonFormPatameter name(String name) {
	        this.setName(name);
	        return this;
	    }

	    public Model getSchema() {
	        return schema;
	    }

	    public void setSchema(Model schema) {
	        this.schema = schema;
	    }

	    public void addExample(String mediaType, String value) {
	        if(examples == null) {
	            examples = new LinkedHashMap<String, String>();
	        }
	        examples.put(mediaType, value);
	    }

	    @JsonProperty("x-examples")
	    public Map<String, String> getExamples() {
	        return examples;
	    }

	    public void setExamples(Map<String, String> examples) {
	        this.examples = examples;
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = super.hashCode();
	        result = prime * result + ((schema == null) ? 0 : schema.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (!super.equals(obj)) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        JsonFormPatameter other = (JsonFormPatameter) obj;
	        if (schema == null) {
	            if (other.schema != null) {
	                return false;
	            }
	        } else if (!schema.equals(other.schema)) {
	            return false;
	        }
	        return true;
	    }

}
