package com.chevrolet.api.enums.lock;

/**
 * @author maihe
 */

public enum CarLockBizTypeEnum {
    INVALID(-1,"无效"),
    CAR_LOA_PICK_UP(1,"订单宝提车"),
    LOAN_CAR_PICK_UP(2,"库融宝提车"),
    CAPITAL_PICK_UP(6,"资方提车"),
    WTO(3,"秒车库"),
    TMS(4,"物流"),
    WMS(5,"仓储"),
    WMS_PICK_UP(501,"仓储-提车申请");

    private Integer code;
    private String desc;

    CarLockBizTypeEnum(Integer code, String desc) {
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
