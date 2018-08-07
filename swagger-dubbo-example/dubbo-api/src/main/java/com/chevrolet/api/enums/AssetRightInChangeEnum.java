package com.chevrolet.api.enums;

/**
 * @author maihe
 */

public enum AssetRightInChangeEnum {

    NORMAL(0, "非物权变更中"),
    IN_CHANGE(1,"物权变更中");

    private Integer code;
    private String desc;

    AssetRightInChangeEnum(Integer code, String desc) {
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
