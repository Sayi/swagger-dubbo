package com.chevrolet.api.service;

import com.chevrolet.api.dto.CheckCarDTO;
import com.chevrolet.api.dto.request.CheckCarRequest;
import com.mhc.bs.common.base.APIResult;

import java.util.List;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.mhc.chevrolet.api
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/12 下午5:02
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
public interface CheckCarFacade {

    /**
     * <p> 根据指定条件获取验车数据 </p>
     * @param checkCarRequest
     * @return APIResult<List<CheckCarDTO>>
     * @throws
     * @author 绪超 (xuchao@maihaoche.com)
     * @date 2018/7/13 上午9:36
     * @since V1.1.0-SNAPSHOT
     *
     */
    APIResult<List<CheckCarDTO>> listCheckCarsByRequest(CheckCarRequest checkCarRequest);

    /**
     * 新增验车数据
     * @param checkCarDTO
     * @return
     */
    APIResult<Long> addCheckCar(CheckCarDTO checkCarDTO);

    /**
     * 更新验车数据
     * @param checkCarDTO
     * @return
     */
    APIResult<Boolean> updateCheckCar(CheckCarDTO checkCarDTO);

}
