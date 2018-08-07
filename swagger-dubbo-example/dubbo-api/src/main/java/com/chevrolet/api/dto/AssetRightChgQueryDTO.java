package com.chevrolet.api.dto;

import com.chevrolet.api.enums.AssetRightTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author maihe
 */
@Data
@ApiModel(description = "物权变更查询")
public class AssetRightChgQueryDTO implements Serializable{
    private static final long serialVersionUID = -9050871844089374913L;

    private Long assetRightChgRecordId;

    // 变更发起人id
    @ApiModelProperty(value = "变更发起人id")
    private Long assetRight;

    //变更发起人类型
    @ApiModelProperty(value = "变更发起人类型")
    private AssetRightTypeEnum assetRightType;
}
