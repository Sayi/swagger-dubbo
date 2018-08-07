package com.chevrolet.api.enums.lock;

/**
 * @author maihe
 */

public enum CarLockExtStatusEnum {

    OPEN(1,"打开"),
    CLOSED(0,"关闭"),
    ;
    private Integer code;
    private String desc;

    CarLockExtStatusEnum(Integer code, String desc) {
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
