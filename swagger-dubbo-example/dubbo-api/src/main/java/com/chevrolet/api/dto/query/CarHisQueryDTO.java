/**
 * Allrights Reserved,Designed By www.maihaoche.com
 * @Package com.chevrolet.api.dto.query
 * @author 加菲 (jiafei@maihaoche.com)
 * @date 2018/4/18 11:18
 * @Copyright 2017-2018 www.maihaoche.comInc.Allrightsreserved.
 * 注意: 本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业项目
 */
package com.chevrolet.api.dto.query;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * <p> 车辆历史查询请求 </p>
 *
 * @author 加菲（jiafei@maihaoche.com）
 * @date 2018/4/18 11:18
 * @since V1.0
 */
@Builder
@Data
public class CarHisQueryDTO implements Serializable {

    private static final long serialVersionUID = -492108541849000315L;

    /**
     * carId + 更改时间查询唯一记录
     */
    private Map<Long, Date> idAndUpdateTime;
}
