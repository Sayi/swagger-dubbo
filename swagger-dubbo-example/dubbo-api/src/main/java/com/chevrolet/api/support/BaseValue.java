/**
 * Allrights Reserved,Designed By www.maihaoche.com
 *
 * @Package com.chevrolet.api.support
 * @author 清禾 (qinghe@maihaoche.com)
 * @date 2018/4/27 上午11:53
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.chevrolet.api.support;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>  </p> 
 *
 * @author 清禾（qinghe@maihaoche.com）
 * @date 2018/4/27 上午11:53
 * @since V1.0
 */
@Data
public class BaseValue implements Serializable{
    /**
     * value内容
     */
    private String valueData;

    /**
     * 主键
     */
    private Long valueId;

    /**
     * 创建时间
     */
    private Date gmtCreate;
}
