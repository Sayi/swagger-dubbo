package com.chevrolet.api.enums;

/**
 * @author wenruo
 * @date 2017/5/22.
 */
public enum CarSourceTypeEnum {
    INVENTORY_FINANCING(3, "库融宝");
    private Integer code;
    private String msg;

    CarSourceTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return msg;
    }

    public static String getMsgByCode(Integer code) {
        for (CarSourceTypeEnum status : CarSourceTypeEnum.values()) {
            if (status.code.equals(code)) {
                return status.msg;
            }
        }
        return null;
    }

}
