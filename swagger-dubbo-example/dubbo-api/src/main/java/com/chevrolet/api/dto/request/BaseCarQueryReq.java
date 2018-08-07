package com.chevrolet.api.dto.request;

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
@ApiModel(description = "基础车辆请求对象")
public class BaseCarQueryReq implements Serializable {
    private static final long serialVersionUID = -433755409980380371L;
    //车辆id
    @ApiModelProperty(value = "车辆ID列表")
    private List<Long> carIds;
    //物权人id
    @ApiModelProperty(value = "物权人id")
    private Long assetRight;
    //物权类型
    @ApiModelProperty(value = "物权类型")
    private AssetRightTypeEnum assetRightType;

    @ApiModelProperty(value = "车架号模糊")
    private String fuzzyCarUnique;

    @ApiModelProperty(value = "车型名称模糊")
    private String fuzzyModelName;
}
