/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.chevrolet.api.dto.request
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2018/4/27 上午11:22
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.chevrolet.api.dto.request;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>  </p> 
 *
 * @author 清禾（qinghe@maihaoche.com）
 * @date 2018/4/27 上午11:22
 * @since V1.0
 */
@Data
public class SeriesRequest implements Serializable {


    private static final long serialVersionUID = -3682935893235764700L;
    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 企业Id
     */
    private Long partnerId;

    /**
     * 品牌Id
     */
    private Long brandId;

    /**
     * 状态
     */
    private Integer status;
}
