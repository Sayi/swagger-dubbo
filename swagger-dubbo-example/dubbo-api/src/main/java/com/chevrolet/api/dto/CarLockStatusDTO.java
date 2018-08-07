/**
 * AllrightsReserved,DesignedBywww.maihaoche.com
 * Package com.chevrolet.api.dto
 * author: shengqiang (shengqiang@maihaoche.com)
 * date:  2018/3/21下午3:01
 * Copyright:2017-2018www.maihaoche.comInc.Allrightsreserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Description: 查询车辆回款状态
 * author: shengqiang (shengqiang@maihaoche.com)
 * date: 2018/3/21下午3:01
 * sinceV1.0
 */
@Data
public class CarLockStatusDTO implements Serializable {

    private static final long serialVersionUID = -5785167418634823436L;

    /**
     * ccCarId
     */
    private Long ccCarId;

    /**
     * 车辆锁状态
     */
    private Integer locked;
}
