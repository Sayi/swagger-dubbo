package com.chevrolet.api.enums;

/**
 * Created by zhouxiaoliu on 2017/11/1.
 *
 * Copied by xingxuan on 2017/12/14
 */
public enum TmsOrderSourceTypeEnum {
    LOAN_ORDER(1, "订单宝"),
    TMS(2, "纯TMS"),
    WMS_ALLOT(3, "WMS调拨"),
    LINCOLN(4, "对接林肯的运单"),
    WTO(5, "秒车库");

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    TmsOrderSourceTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        TmsOrderSourceTypeEnum[] typeEnumArray = values();
        for (TmsOrderSourceTypeEnum typeEnum : typeEnumArray) {
            if (typeEnum.getCode().equals(code)) {
                return typeEnum.getMsg();
            }
        }
        return null;
    }
}
