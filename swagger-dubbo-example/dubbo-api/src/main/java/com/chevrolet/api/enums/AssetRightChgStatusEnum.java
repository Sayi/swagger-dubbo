package com.chevrolet.api.enums;

/**
 * @author maihe
 */
public enum AssetRightChgStatusEnum {

    NEED_SIGN(1, "待签约"),
    NEED_CONFIRM(2, "待对方确认"),
    FINISHED(3,"已完成"),
    CANCELED(4,"已取消"),
    DISCARD(5,"已作废(对方超时未确认)");

    private Integer code;
    private String desc;

    AssetRightChgStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetRightChgStatusEnum getRecordStatusEnum(Integer status){
        for (AssetRightChgStatusEnum assetRightChgStatusEnum : AssetRightChgStatusEnum.values()) {
            if(assetRightChgStatusEnum.getCode().equals(status)){
                return assetRightChgStatusEnum;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
