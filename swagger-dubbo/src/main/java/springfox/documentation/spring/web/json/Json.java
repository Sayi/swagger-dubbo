package springfox.documentation.spring.web.json;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonValue;

public class Json {
    private final String value;

    public Json(String value) {
      this.value = value;
    }

    @JsonValue
    @JsonRawValue
    public String value() {
      return value;
    }

    public String getValue() {
        return value;
    }
    
    
  }