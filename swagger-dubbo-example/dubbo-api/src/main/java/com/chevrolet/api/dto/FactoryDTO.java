package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.chevrolet.api.dto
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/9 下午3:00
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@Data
public class FactoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long factoryId;

    /**
     * 厂商名称
     */
    private String factoryName;

    /**
     * 厂商类型(国产 1 中规 10 平行进口100)
     */
    private Integer factoryType;

    /**
     * 厂商状态
     */
    private Integer status;

    /**
     * database column b2b_factory.gmt_create
     */
    private Date gmtCreate;

    /**
     * database column b2b_factory.gmt_modified
     */
    private Date gmtModified;

    /**
     * 外部ID
     */
    private String outerId;

    /**
     * 1:汽车之家 2:陈行168
     */
    private Integer source;

    /**
     * 车规
     */
    private Integer standard;

}
