package com.chevrolet.api.enums;

/**
 * Created by maihe on 2017/5/15.
 */
public enum CarLoanOrderTypeEnum {

    ORDER(1,"订单宝"),
    CAR(2,"融租宝");

    private Integer code;
    private String desc;

    CarLoanOrderTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
