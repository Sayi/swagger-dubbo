package com.chevrolet.api.enums;

/**
 * Created by maihe on 2017/5/17.
 */
public enum FuzzyQueryEnum {
    /**
     *
     */
    ORDER_LOAN_CAR_ID("订单贷",0,"车辆ID" ),
    /**
     * 中规 1
     */
    CAR_LOAN_ORDER_NO("订单贷",1,"订单编号");

    private String sysCode;
    private Integer value;
    private String desc;
    FuzzyQueryEnum(String sysCode,Integer value,String desc){
        this.sysCode = sysCode;
        this.value =value;
        this.desc = desc;
    }

    public String getSysCode(){
        return this.sysCode;
    }

    public Integer getValue(){
        return this.value;
    }

    public String getDesc(){
        return  this.desc;
    }
}
