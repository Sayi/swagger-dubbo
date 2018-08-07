package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author maihe
 */
@Data
public class AssetRightChgResultDTO implements Serializable {
    private static final long serialVersionUID = 576914024983610753L;
    //id
    private Long assetRightChgRecordId;

    //物权人id
    private Long assetRight;

    //物权人name
    private String assetRightName;

    //物权人类型
    private Integer assetRightType;

    //接收人企业id
    private Long partnerId;

    //接收人企业name
    private String partnerName;

    //接收人手机号
    private String receiveTel;

    //接收人姓名
    private String receiveName;

    //接收人身份证号
    private String receiveCertNo;

    private List<BaseCarDTO> cars;

    //状态
    private Integer recordStatus;

    //状态描述
    private String recordStatusDesc;

    //签章时间
    private Date signTime;

    //接收人确认时间
    private Date confirmTime;

    //发起时间
    private Date gmtCreate;

    //更新时间
    private Date gmtModified;
}
