package com.chevrolet.api.dto.request;

import com.subaru.common.model.request.BaseDubboRequest;
import lombok.Data;

import java.util.List;

/**
 * Created by maihe on 2017/6/6.
 */
@Data
public class BaseCarReq extends BaseDubboRequest {
    private static final long serialVersionUID = 2748601614501622805L;
    //车辆id
    private Long carId;
    //车架号
    private String carUnique;
    //订单号
//    private String carLoanOrderNo;
    //车型id
    private Long modelId;
    //品牌id
    private Long brandId;
    //车系id
    private Long seriesId;
    //车辆ID集合
    private List<Long> carIds;
}
