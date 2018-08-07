package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by weishuai on 16/1/15.
 */
@Data
public class SeriesDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     *工厂名称
     */
    private String factoryName;
    /**
     * 车系id
     */
    private Long seriesId;

    /**
     * 车型名称
     */
    private String seriesName;

    /**
     * 厂商id
     */
    private Long factoryId;
    
    /**
     * 车系状态 1-正常 2-即将开售 3-在售
     */
    private Integer seriesStatus;

}
