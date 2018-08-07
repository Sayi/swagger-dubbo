package com.chevrolet.api.enums;

/**
 * TMS系统中的业务订单类型
 *
 * @author wenruo
 * @date 2017/5/25.
 */
public enum TmsBizOrderTypeEnum {

    COMMON(1, "普通运单"),
    ORDER_LOAN(2, "订单宝");

    private Integer code;
    private String msg;

    TmsBizOrderTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        TmsBizOrderTypeEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            TmsBizOrderTypeEnum iEnum = arr[i];
            if (iEnum.getCode().equals(code)) {
                return iEnum.msg;
            }
        }
        return null;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
