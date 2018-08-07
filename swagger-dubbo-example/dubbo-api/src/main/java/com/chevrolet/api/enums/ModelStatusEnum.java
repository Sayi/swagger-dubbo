package com.chevrolet.api.enums;

/**
 * Created by suclogger .
 *
 * 1-在售，2-即将在售，3-停售
 *
 */
public enum ModelStatusEnum {

    SELLING(1,"在售" ),
    PRE_SELLING(2, "即将在售"),
    STOP_SELLING(3, "停售"),
    ;

    private Integer value;
    private String desc;
    ModelStatusEnum(Integer value, String desc){
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
