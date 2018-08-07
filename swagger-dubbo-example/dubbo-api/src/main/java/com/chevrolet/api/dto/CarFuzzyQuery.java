package com.chevrolet.api.dto;

import com.subaru.common.model.request.BaseDubboRequest;
import lombok.Data;

import java.util.List;

/**
 * @author maihe
 */
@Data
public class CarFuzzyQuery extends BaseDubboRequest {
    private static final long serialVersionUID = 8402828109635176102L;
    //carId
    private List<Long> carIds;
    //批量查询
    private List<String> carUniques;
    //车架号
    private String carUnique;
    //品牌
    private String brandName;
    //车系
    private String seriesName;
    //车型name
    private String modelName;
    //物权
    private Long assetRight;
    //物权type
    private Integer assetRightType;
    //模糊字段 目前支持 caruniuqe modelname
    private String fuzzyField;
    //是否采用分页 0默认不分页 1分页
    private int isPaged = 0;
}
