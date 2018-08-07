package com.chevrolet.api.enums;

/**
 * Created by maihe on 2017/6/9.
 */
public enum CommonEnum {
    /**
     *  无效 -99
     */
    NOT_VALID(-99,"无效");

    private Integer value;
    private String desc;
    CommonEnum(Integer value, String desc){
        this.value =value;
        this.desc = desc;
    }

    public Integer getValue(){
        return this.value;
    }

    public String getDesc(){
        return  this.desc;
    }
}
