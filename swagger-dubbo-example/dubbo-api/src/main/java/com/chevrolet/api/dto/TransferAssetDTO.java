package com.chevrolet.api.dto;

import com.chevrolet.api.enums.AssetRightTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author maihe
 */
@Data
public class TransferAssetDTO implements Serializable {
    private static final long serialVersionUID = -6306371909120044415L;

    //  cc car id
    private List<Long> carIds;

    //原物权
    private Long oldAssetRight;

    //原物权类型
    private AssetRightTypeEnum oldAssetRightType;

    // 物权
    private Long assetRight;

    // 物权名
    private String assetRightName;

    //物权类型
    private AssetRightTypeEnum assetRightType;
}