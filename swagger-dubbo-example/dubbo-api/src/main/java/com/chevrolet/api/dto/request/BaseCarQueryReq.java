package com.chevrolet.api.dto.request;

import com.chevrolet.api.enums.AssetRightTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author maihe
 */
@Data
public class BaseCarQueryReq implements Serializable {
    private static final long serialVersionUID = -433755409980380371L;
    //车辆id
    private List<Long> carIds;
    //物权人id
    private Long assetRight;
    //物权类型
    private AssetRightTypeEnum assetRightType;

    private String fuzzyCarUnique;

    private String fuzzyModelName;
}
