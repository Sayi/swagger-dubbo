package com.chevrolet.api.enums;

/**
 * @author wenruo
 * @date 2017/5/25.
 */
public enum TmsCarTransportStatusEnum {

    WAITING_PAYMENT(1, "待收费"),
    WAITING_INSPECTION(2, "待验车"),
    CAN_INSPECTION(3, "可验车"),
    WAITING_SHIP(4, "待发车"),
    CAN_SHIP(5, "可发车"),
    ON_ROAD(6, "在途"),
    ARRIVED_FORBIDDEN_DELIVER(7, "到达不可放车"),
    ARRIVED_ALLOW_DELIVER(8, "到达可放车"),
    COMPLETED(9, "完成"),
    INVALID(10, "作废");

    private Integer code;
    private String msg;

    TmsCarTransportStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        TmsCarTransportStatusEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            TmsCarTransportStatusEnum iEnum = arr[i];
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
