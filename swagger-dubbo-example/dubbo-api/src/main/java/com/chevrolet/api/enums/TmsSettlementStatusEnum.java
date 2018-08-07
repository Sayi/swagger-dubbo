package com.chevrolet.api.enums;

/**
 * Created by mahe on 2017/6/2.
 *
 * Copied by xingxuan on 2017/12/14
 */
public enum TmsSettlementStatusEnum {
    YET(0, "未结算"),
    DONE(1, "已结算"),
    ;
    private Integer code;
    private String msg;

    TmsSettlementStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        TmsSettlementStatusEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            TmsSettlementStatusEnum iEnum = arr[i];
            if (iEnum.getCode().equals(code)) {
                return iEnum.getMsg();
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
