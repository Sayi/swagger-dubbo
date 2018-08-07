package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.CarFuzzyQuery;
import com.chevrolet.api.service.CarSearchService;
import com.subaru.common.entity.BizResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.mhc.chevrolet.core.biz
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/9 下午5:00
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@Service(interfaceClass = CarSearchService.class)
public class CarSearchFacadeImpl implements CarSearchService {


    @Override
    public BizResult<List<BaseCarDTO>> queryCarDetailPagination(CarFuzzyQuery carFuzzyQuery) {
        return null;
    }
}
