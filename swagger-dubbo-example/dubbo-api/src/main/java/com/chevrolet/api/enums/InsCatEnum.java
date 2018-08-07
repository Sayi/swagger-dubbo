package com.chevrolet.api.enums;

import lombok.Getter;

/**
 * 类简介：出险分类枚举
 * 时间：  2018/5/24
 * 邮箱：  miaodao@maihaoche.com
 */
public enum InsCatEnum {
    UN_DEFINED(0, "未分类"),
    IN_STORE(1, "出险在库"),
    OUT_STORE(2, "出险不在库");


    InsCatEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Getter
    private Integer code;
    @Getter
    private String msg;

    public static String getMsg(Integer code) {
        if (code == null) {
            return "";
        }
        InsCatEnum[] enums = values();
        for (InsCatEnum catEnum : enums) {
            if (catEnum.getCode().equals(code)) {
                return catEnum.getMsg();
            }
        }
        return "";
    }

}
