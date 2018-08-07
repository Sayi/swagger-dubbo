package com.chevrolet.api.enums;

public enum AssetRightDefaultEnum {

    DEFAULT_ASSET_RIGHT(-2L, "初始物权人");

    private Long code;
    private String desc;

    AssetRightDefaultEnum(Long code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Long getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
