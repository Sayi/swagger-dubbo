package com.chevrolet.api.dto;

import com.subaru.common.model.request.BaseDubboRequest;
import lombok.Data;

/**
 * @author jide
 * @date 2018/5/7
 */
@Data
public class LimitCarQuery extends BaseDubboRequest {
    private Long fromCarId;
    private Long userId;
    private Long partnerId;
}
