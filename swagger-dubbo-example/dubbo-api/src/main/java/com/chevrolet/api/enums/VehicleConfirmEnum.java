package com.chevrolet.api.enums;

/**
 * Created by maihe on 2017/5/24.
 */
public enum VehicleConfirmEnum {
    /**
     * -1 不接受验车结果
     */
    REFUSE(-1,"拒绝"),

    /**
     * 0 确认中
     */
    CONFIRMING(0,"确认中"),

    /**
     * 1 接受（默认）
     */
    ACCEPT(1,"接受");

    private Integer value;
    private String desc;
    VehicleConfirmEnum(Integer value,String desc){
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
