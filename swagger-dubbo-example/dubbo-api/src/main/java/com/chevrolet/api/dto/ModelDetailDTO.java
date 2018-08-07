package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by suclogger on 2017/6/21.
 */
@Data
public class ModelDetailDTO implements Serializable {

    /**
     * 车型ID
     */
    private Long modelId;

    /**
     * 车型名
     */
    private String modelName;

    /**
     * 车系id
     */
    private Long seriesId;

    /**
     * 品牌ID
     */
    private Long brandId;

    /**
     * 车规ID
     */
    private Integer standard;

    /**
     * 年款
     */
    private String year;

    /**
     * 销售状态 @see com.chevrolet.ModelStatusEnum
     */
    private Integer status;

    /**
     * 排量
     */
    private String displacement;

    /**
     * 前驱后驱
     */
    private String drive;

    /**
     * 汽油柴油
     */
    private String fuel;

    /**
     * 几座
     */
    private String seat;

    /**
     * 指导价
     */
    private String guidePrice;

    /**
     * 短名称，一般是modelName去除品牌车系后的名字，用于层级菜单展示
     *
     * 比如：
     * modelName: 宝马7系 2014款 730Li 臻享型
     * wapName: 730Li 臻享型
     *
     */
    private String wapName;

    private Integer length;

    private Integer width;

    private Integer height;

}
