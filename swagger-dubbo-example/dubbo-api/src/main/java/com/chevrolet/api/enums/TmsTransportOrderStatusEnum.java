package com.chevrolet.api.enums;

/**
 * TMS运单状态
 *
 * @author wenruo
 * @date 2017/5/25.
 */
public enum TmsTransportOrderStatusEnum {

    WAITING_PAYMENT(1, "待收款"),
    ON_GOING(2, "进行中"),
    COMPLETED(3, "已完成"),
    INVALID(4, "失效");

    private Integer code;
    private String msg;

    TmsTransportOrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        TmsTransportOrderStatusEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            TmsTransportOrderStatusEnum iEnum = arr[i];
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
