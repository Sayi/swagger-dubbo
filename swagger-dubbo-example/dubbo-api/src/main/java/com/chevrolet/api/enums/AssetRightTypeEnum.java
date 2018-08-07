package com.chevrolet.api.enums;

/**
 * @author maihe
 */

public enum AssetRightTypeEnum {

    DEFAULT(0,"默认"),
    PERSONAL(1, "个人"),
    ENTERPRISE(2, "企业");



    private Integer code;
    private String desc;

    AssetRightTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AssetRightTypeEnum getAssetRightType(Integer assetRightType){
        for (AssetRightTypeEnum assetRightTypeEnum : AssetRightTypeEnum.values()) {
            if(assetRightTypeEnum.getCode().equals(assetRightType)){
                return assetRightTypeEnum;
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
