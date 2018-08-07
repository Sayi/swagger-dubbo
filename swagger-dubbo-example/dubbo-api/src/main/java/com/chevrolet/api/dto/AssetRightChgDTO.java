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
@ApiModel(description = "物权变更")
public class AssetRightChgDTO implements Serializable {
    private static final long serialVersionUID = -2993217399606423267L;

    //物权变更单id
    @ApiModelProperty(value = "物权变更单id")
    private Long assetRightChgRecordId;

    //物权人id
    @ApiModelProperty(value = "物权人id")
    private Long assetRight;

    //物权人name
    @ApiModelProperty(value = "物权人name")
    private String assetRightName;

    //物权人类型
    @ApiModelProperty(value = "物权人类型")
    private AssetRightTypeEnum assetRightType;

    //接收人手机号
    @ApiModelProperty(value = "接收人手机号")
    private String receiveTel;

    //接收人姓名
    @ApiModelProperty(value = "接收人姓名")
    private String receiveName;

    //接收人身份证号
    @ApiModelProperty(value = "接收人身份证号")
    private String receiveCertNo;

    @ApiModelProperty(value = "车辆ID")
    private List<Long> carIds;

    @ApiModelProperty(value = "联系人id")
    private Long contractId;
}
