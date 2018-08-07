package com.chevrolet.api.enums;

/**
 * Created by maihe on 2017/5/19.
 */
public enum PredicationEnum {

    /**
     *
     */
    NO(0,"否" ),
    /**
     * 中规 1
     */
    YES(1,"是");

    private Integer value;
    private String desc;
    PredicationEnum(Integer value,String desc){
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
