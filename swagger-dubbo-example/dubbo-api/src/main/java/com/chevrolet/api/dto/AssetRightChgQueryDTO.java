package com.chevrolet.api.dto;

import com.chevrolet.api.enums.AssetRightTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author maihe
 */
@Data
public class AssetRightChgQueryDTO implements Serializable{
    private static final long serialVersionUID = -9050871844089374913L;

    private Long assetRightChgRecordId;

    // 变更发起人id
    private Long assetRight;

    //变更发起人类型
    private AssetRightTypeEnum assetRightType;
}
