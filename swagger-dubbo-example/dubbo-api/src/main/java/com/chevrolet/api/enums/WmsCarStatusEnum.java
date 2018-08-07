package com.chevrolet.api.enums;

/**
 * Created by kechangqiang on 16/9/26.
 */
public enum WmsCarStatusEnum {
    //车辆状态:1库内锁定正常，2库内锁定质损，3库内解锁正常，4库内解锁质损，5库外锁定正常，6库外锁定质损，7库外解锁正常，8库外解锁质损，9损毁
    INSIDE_LOCK_NOMAL(1, "库内锁定正常"),
    INSIDE_LOCK_SPOLIED(2, "库内锁定质损"),
    INSIDE_AUDIT_NOMAL(3, "库内审核正常"),
    INSIDE_AUDIT_SPOLIED(4, "库内审核质损"),
    INSIDE_UNLOCK_NOMAL(5, "库内解锁正常"),
    INSIDE_UNLOCK_SPOLIED(6, "库内解锁质损"),
    OUT_LOCK_NOMAL(7, "库外锁定正常"),
    OUT_LOCK_SPOLIED(8, "库外锁定质损"),
    OUT_UNLOCK_NOMAL(9, "库外解锁正常"),
    OUT_UNLOCK_SPOLIED(10, "库外解锁质损"),
    UNUSED(11, "损毁"),
    REFUSE_ENTRY(19, "拒绝入库"),
    CAN_MOVE_NORMAL(31, "移库可出库正常"),
    CAN_MOVE_SPOLIED(32, "移库可出库质损"),
    HAS_MOVED(33, "移库已出库");


    private Integer code;
    private String msg;

    WmsCarStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsgByCode(Integer code) {
        WmsCarStatusEnum[] arr = values();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            WmsCarStatusEnum iEnum = arr[i];
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
