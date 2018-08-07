package com.chevrolet.api.dto;

import com.chevrolet.api.enums.AssetRightTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author maihe
 */
@Data
@ApiModel(description = "物权变更申请")
public class AssetRightChgApplyDTO implements Serializable {
    private static final long serialVersionUID = -2993217399606423267L;

    // 变更发起人id
    @ApiModelProperty(value = "变更发起人id")
    private Long assetRight;

    //变更发起人name
    @ApiModelProperty(value = "变更发起人name")
    private String assetRightName;

    //变更发起人类型
    @ApiModelProperty(value = "变更发起人类型")
    private AssetRightTypeEnum assetRightType;

    //接收人企业id
    @ApiModelProperty(value = "接收人企业id")
    private Long partnerId;

    //接收人企业name
    @ApiModelProperty(value = "接收人企业name")
    private String partnerName;

    //注册用户id
    @ApiModelProperty(value = "注册用户id")
    private Long userId;

    //注册用户name
    @ApiModelProperty(value = "注册用户name")
    private String userName;

    //接收人手机号
    @ApiModelProperty(value = "接收人手机号")
    private String receiveTel;

    //接收人姓名
    @ApiModelProperty(value = "接收人姓名")
    private String receiveName;

    //接收人身份证号
    @ApiModelProperty(value = "接收人身份证号")
    private String receiveCertNo;

    //合同ID
    @ApiModelProperty(value = "合同ID")
    private Long contractId;

    //关联carIds
    @ApiModelProperty(value = "关联carIds")
    List<Long> carIds;
}
