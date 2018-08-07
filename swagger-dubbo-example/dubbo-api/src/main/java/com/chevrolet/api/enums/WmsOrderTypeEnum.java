package com.chevrolet.api.enums;

/**
 * Created by kechangqiang on 16/9/23.
 */
public enum WmsOrderTypeEnum {
    //1订单贷，2库存融资，3寄售，4其它
    ORDER_LOAN(1, "D", "订单宝"),
    INVENTORY_FINANCING(2, "K", "库融宝"),
    CONSIGNMENT(3, "J", "寄售"),
    DAODIAN(4, "Z", "展车宝"),
    OTHERS(99, "O", "其它");

    private Integer code;
    private String type;
    private String message;

    WmsOrderTypeEnum(Integer code, String type, String message) {
        this.code = code;
        this.type = type;
        this.message = message;
    }

    public static String getMesByCode(Integer code) {
        WmsOrderTypeEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            WmsOrderTypeEnum iEnum = arr[i];
            if (iEnum.getCode().equals(code)) {
                return iEnum.getMessage();
            }
        }
        return null;
    }

    public static String getTypeByCode(Integer code) {
        WmsOrderTypeEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            WmsOrderTypeEnum iEnum = arr[i];
            if (iEnum.getCode().equals(code)) {
                return iEnum.getType();
            }
        }
        return null;
    }

    public static WmsOrderTypeEnum getOrderTypeEnumByCode(Integer code) {
        WmsOrderTypeEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            WmsOrderTypeEnum iEnum = arr[i];
            if (iEnum.getCode().equals(code)) {
                return iEnum;
            }
        }
        return null;
    }

    public String getType() {
        return this.type;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
