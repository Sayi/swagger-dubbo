package com.chevrolet.api.enums;

/**
 * Created by zhouxiaoliu on 16/9/24.
 */
public enum WarehouseStatusEnum {
    AVAILABLE(1, "正常"),
    SUSPEND(2, "暂停"),
    CLOSED(3, "关闭");
    private Integer code;
    private String msg;

    WarehouseStatusEnum(Integer code, String msg) {
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
        for (WarehouseStatusEnum status : WarehouseStatusEnum.values()) {
            if (status.code.equals(code)) {
                return status.msg;
            }
        }
        return null;
    }
}
