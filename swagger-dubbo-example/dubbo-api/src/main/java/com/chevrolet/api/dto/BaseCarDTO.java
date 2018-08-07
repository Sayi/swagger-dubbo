package com.chevrolet.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author suclogger
 * @date 2017/5/11
 */
@Data
@ApiModel(description = "基础车辆信息")
public class BaseCarDTO implements Serializable {

    private static final long serialVersionUID = 1105014029120553138L;
    /**
     * 车辆ID
     */
    @ApiModelProperty(value = "车辆ID")
    private Long carId;

    /**
     * 车架号
     */
    @ApiModelProperty(value = "车架号")
    private String carUnique;

    /**
     * 车规ID
     */
    @ApiModelProperty(value = "车规ID")
    private Integer specId;

    /**
     * 车规
     */
    @ApiModelProperty(value = "车规")
    private String specName;

    /**
     * 品牌id
     */
    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    /**
     * 品牌name
     **/
    @ApiModelProperty(value = "品牌name")
    private String brandName;

    /**
     * 车系id
     */
    @ApiModelProperty(value = "车系id")
    private Long seriesId;

    /**
     * 车系name
     */
    @ApiModelProperty(value = "车系name")
    private String seriesName;

    /**
     * 车型ID
     */
    @ApiModelProperty(value = "车型ID")
    private Long modelId;

    /**
     * 车型
     */
    @ApiModelProperty(value = "车型")
    private String modelName;

    /**
     * 外观
     */
    @ApiModelProperty(value = "外观")
    private String outerColorName;

    /**
     * 内饰
     */
    @ApiModelProperty(value = "内饰")
    private String innerColorName;

    /**
     * 外观
     */
    @ApiModelProperty(value = "外观")
    private Long outerColorId;

    /**
     * 内饰
     */
    @ApiModelProperty(value = "内饰")
    private Long innerColorId;

    /**
     * 公里数
     */
    @ApiModelProperty(value = "公里数")
    private String odometer;

    /**
     * 发动机排量
     */
    @ApiModelProperty(value = "发动机排量")
    private String emission;

    /**
     * 生产日期
     */
    @ApiModelProperty(value = "生产日期")
    private String productionDate;

    /**
     * 前45度照片
     */
    @ApiModelProperty(value = "前45度照片")
    private String imgFront;

    /**
     * 后45度照片
     */
    @ApiModelProperty(value = "后45度照片")
    private String imgBehind;

    /**
     * 内饰照片
     */
    @ApiModelProperty(value = "内饰照片")
    private String imgInterior;

    /**
     * 里程照片
     */
    @ApiModelProperty(value = "里程照片")
    private String imgMileage;

    /**
     * 铭牌照片
     */
    @ApiModelProperty(value = "铭牌照片")
    private String imgNameplate;

    /**
     * 损伤照片
     */
    @ApiModelProperty(value = "损伤照片")
    private List<String> imgDamage;

    /**
     * 车辆描述字段
     */
    @ApiModelProperty(value = "车辆描述字段")
    private String carDesc;

    /**
     * 车辆指导价
     */
    @ApiModelProperty(value = "车辆指导价")
    private String guidePrice;

    /**
     * 车辆来源
     */
    @ApiModelProperty(value = "车辆来源")
    private Integer carSource;

    /**
     * 物权人id
     */
    @ApiModelProperty(value = "物权人id")
    private Long assetRight;

    /**
     * 物权人name
     */
    @ApiModelProperty(value = "物权人name")
    private String assetRightName;

    /**
     * 物权人type
     */
    @ApiModelProperty(value = "物权人type")
    private Integer assetRightType;

    /**
     * 是否物权变更
     */
    @ApiModelProperty(value = "是否物权变更")
    private Integer assetRightInChange;

    /**
     * 是否有效
     */
    @ApiModelProperty(value = "是否有效")
    private Integer isDeleted;

}
