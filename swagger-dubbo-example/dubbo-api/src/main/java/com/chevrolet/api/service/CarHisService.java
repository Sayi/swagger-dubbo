/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.chevrolet.api.service
 * @author 加菲（jiafei@maihaoche.com）
 * @date   2018/4/18 11:14
 * @Copyright 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
package com.chevrolet.api.service;

import com.chevrolet.api.dto.CarHisDTO;
import com.chevrolet.api.dto.query.CarHisQueryDTO;
import com.subaru.common.entity.APIResult;

import java.util.List;

/**
 * <p> 车辆历史记录服务接口 </p>
 *
 * @author 加菲（jiafei@maihaoche.com）
 * @date 2018/4/18 11:14
 * @since V1.0
*/
public interface CarHisService {

    /**
     * 查询车辆历史记录
     * @param carHisQuery
     * @return
     */
    APIResult<List<CarHisDTO>> queryCarHis(CarHisQueryDTO carHisQuery);
}
