package com.chevrolet.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author maihe
 */
@Data
@ApiModel(description = "物权变更结果")
public class AssetRightChgResultDTO implements Serializable {
    private static final long serialVersionUID = 576914024983610753L;
    //id
    @ApiModelProperty(value = "id")
    private Long assetRightChgRecordId;

    //物权人id
    @ApiModelProperty(value = "物权人id")
    private Long assetRight;

    //物权人name
    @ApiModelProperty(value = "物权人name")
    private String assetRightName;

    //物权人类型
    @ApiModelProperty(value = "物权人类型")
    private Integer assetRightType;

    //接收人企业id
    @ApiModelProperty(value = "接收人企业id")
    private Long partnerId;

    //接收人企业name
    @ApiModelProperty(value = "接收人企业name")
    private String partnerName;

    //接收人手机号
    @ApiModelProperty(value = "接收人手机号")
    private String receiveTel;

    //接收人姓名
    @ApiModelProperty(value = "接收人姓名")
    private String receiveName;

    //接收人身份证号
    @ApiModelProperty(value = "接收人身份证号")
    private String receiveCertNo;

    @ApiModelProperty(value = "车辆")
    private List<BaseCarDTO> cars;

    //状态
    @ApiModelProperty(value = "状态")
    private Integer recordStatus;

    //状态描述
    @ApiModelProperty(value = "状态描述")
    private String recordStatusDesc;

    //签章时间
    @ApiModelProperty(value = "签章时间")
    private Date signTime;

    //接收人确认时间
    @ApiModelProperty(value = "接收人确认时间")
    private Date confirmTime;

    //发起时间
    @ApiModelProperty(value = "发起时间")
    private Date gmtCreate;

    //更新时间
    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;
}
