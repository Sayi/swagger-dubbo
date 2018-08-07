package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.chevrolet.api.dto.CheckCarDTO;
import com.chevrolet.api.dto.request.CheckCarRequest;
import com.chevrolet.api.service.CheckCarFacade;
import com.mhc.bs.common.base.APIResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.mhc.chevrolet.core.biz
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/13 上午9:38
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@Service(interfaceClass = CheckCarFacade.class)
public class CheckCarFacadeImpl implements CheckCarFacade {

    @Override
    public APIResult<List<CheckCarDTO>> listCheckCarsByRequest(CheckCarRequest checkCarRequest) {
        return null;
    }

    @Override
    public APIResult<Long> addCheckCar(CheckCarDTO checkCarDTO) {
        return null;
    }

    @Override
    public APIResult<Boolean> updateCheckCar(CheckCarDTO checkCarDTO) {
        return null;
    }
}
