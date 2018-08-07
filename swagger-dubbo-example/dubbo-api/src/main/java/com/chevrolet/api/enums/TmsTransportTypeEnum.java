package com.chevrolet.api.enums;

/**
 * @author wenruo
 * @date 2017/5/25.
 */
public enum TmsTransportTypeEnum {

    MHC_LARGE_HANDCART(1, "卖好车大板车"),
    MHC_SMALL_HANDCART(2, "卖好车物流"),
    VENDOR_FREE_TRANSPOTATION(3, "厂家包邮");

    private Integer code;
    private String msg;

    TmsTransportTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        TmsTransportTypeEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            TmsTransportTypeEnum iEnum = arr[i];
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
