package com.chevrolet.api.enums;

/**
 * Created by kechangqiang on 16/9/27.
 */
public enum WarehouseTypeEnum {
    //仓库类型：1-自建仓；2-合作仓；3-物流仓；4-虚拟仓；5-托管仓
    CUSTOM(1, "自建仓"),
    COOPERATE(2, "合作仓"),
    LOGISTICS(3, "物流仓"),
    FICTITIOUS(4, "虚拟仓"),
    CUSTODY(5, "托管仓"),
    EXHIBITION(6, "展厅仓"),
    CARMARKET(7, "车城仓");


    private Integer code;
    private String msg;

    WarehouseTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        WarehouseTypeEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            WarehouseTypeEnum iEnum = arr[i];
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
