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
@ApiModel(description = "物权转移对象")
public class TransferAssetDTO implements Serializable {
    @ApiModelProperty(value = "车辆ID")
    private static final long serialVersionUID = -6306371909120044415L;

    //  cc car id
    @ApiModelProperty(value = "车辆ID")
    private List<Long> carIds;

    //原物权
    @ApiModelProperty(value = "原物权")
    private Long oldAssetRight;

    //原物权类型
    @ApiModelProperty(value = "原物权类型")
    private AssetRightTypeEnum oldAssetRightType;

    // 物权
    @ApiModelProperty(value = "物权")
    private Long assetRight;

    // 物权名
    @ApiModelProperty(value = "物权名")
    private String assetRightName;

    //物权类型
    @ApiModelProperty(value = "物权类型")
    private AssetRightTypeEnum assetRightType;
}