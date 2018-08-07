package com.chevrolet.api.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by maihe on 2017/5/16.
 */
public enum CarStandardEnum {

    /**
     * 国产
     */
    MadeInChina("国产", 0),
    /**
     * 中规 1
     */
    China("中规", 1),
    /**
     * 美规 2
     */
    America("美规", 2),
    /**
     * 加规 3
     */
    Canada("加规", 3),
    /**
     * 中东 4
     */
    East("中东", 4),
    /**
     * 欧规 5
     */
    Europe("欧规", 5),

    /**
     * 墨西哥版 6
     */
    Mexico("墨西哥版", 6),

    /**
     * 平行进口
     */
    Pxjk("平行进口", 7),

    /**
     * 中规车, 包括 MadeInChina + China
     */
    AllChina("中规", 100);

    private String desc;

    private Integer status;

    CarStandardEnum(String desc, Integer status) {
        this.desc = desc;
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getStatus() {
        return status;
    }

    public static boolean isChina(Integer value) {
        return MadeInChina.getStatus().equals(value) || China.getStatus().equals(value);
    }

    public static Integer getStatusByDesc(String desc) {
        if (!StringUtils.isBlank(desc)) {
            for (CarStandardEnum standard : values()) {
                if (standard.desc.equals(desc)) {
                    return standard.status;
                }
            }
        }
        throw new RuntimeException("Not correct car standard desc.");
    }

    public static String getDescByStatus(String status) {
        if (!StringUtils.isBlank(status)) {
            for (CarStandardEnum standard : values()) {
                if (standard.status.equals(Integer.valueOf(status))) {
                    return standard.desc;
                }
            }
        }
        throw new RuntimeException("Not correct car standard desc.");
    }

    public static CarStandardEnum valueOf(Integer value) {
        switch (value) {
            case 0:
                return MadeInChina;
            case 1:
                return China;
            case 2:
                return America;
            case 3:
                return Canada;
            case 4:
                return East;
            case 5:
                return Europe;
            case 6:
                return Mexico;
            case 7:
                return Pxjk;
            case 100:
                return AllChina;
            default:
                return America;
        }
    }

    public int value() {
        return this.status;
    }
}
