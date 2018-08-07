package com.chevrolet.api.dto;

import com.chevrolet.api.enums.AssetRightTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author maihe
 */

@Data
public class AssetRightChgDTO implements Serializable{
    private static final long serialVersionUID = -2993217399606423267L;

    //物权变更单id
    private Long assetRightChgRecordId;

    //物权人id
    private Long assetRight;

    //物权人name
    private String assetRightName;

    //物权人类型
    private AssetRightTypeEnum assetRightType;

    //接收人手机号
    private String receiveTel;

    //接收人姓名
    private String receiveName;

    //接收人身份证号
    private String receiveCertNo;

    private List<Long> carIds;

    private Long contractId;
}
