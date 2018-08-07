package com.chevrolet.api.enums;

/**
 * @author wenruo
 * @date 2017/8/21.
 */
public enum WmsCarStoreStatusEnum {

    PENDING(1, "待入库"),
    IN_STORE(10, "在库"),
    DEPARTED(20, "已出库");

    private Integer code;
    private String msg;

    WmsCarStoreStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        for (WmsCarStoreStatusEnum carStoreStatusEnum : WmsCarStoreStatusEnum.values()) {
            if (code.equals(carStoreStatusEnum.getCode())) {
                return carStoreStatusEnum.getMsg();
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
