package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.LimitCarQuery;
import com.chevrolet.api.dto.request.BaseCarQueryReq;
import com.chevrolet.api.service.BaseCarService;
import com.subaru.common.entity.APIResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//import com.koenigsegg.dubbo.CarSupervisionService;
//import com.koenigsegg.dubbo.dto.CarSupervisionDetailDTO;

/**
 * @author suclogger
 * @date 2017/5/16
 */
@Service(interfaceClass = BaseCarService.class)
public class BaseCarFacadeImpl implements BaseCarService {


    @Override
    public APIResult<BaseCarDTO> getCarById(Long carId) {
        return null;
    }

    @Override
    public APIResult<Map<Long, BaseCarDTO>> getCarsByIds(List<Long> carIds) {
        return null;
    }

    @Override
    public APIResult<Long> addBaseCar(BaseCarDTO baseCarDTO) {
        return null;
    }

    @Override
    public APIResult<List<Long>> batchSaveCarDTO(BaseCarDTO baseCarDTO, Integer carNumber) {
        return null;
    }

    @Override
    public APIResult<Boolean> updateBaseCar(BaseCarDTO baseCarDTO) {
        return null;
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByCarUnique(String carUnique) {
        return null;
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByCarUniques(List<String> carUniques) {
        return null;
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByCarIds(List<Long> carIds) {
        return null;
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByFuzzyCarUnique(String fuzzyCarUnique) {
        return null;
    }

    @Override
    public APIResult<List<BaseCarDTO>> queryCarsByQueryReq(BaseCarQueryReq baseCarQueryReq) {
        return null;
    }

    @Override
    public APIResult<Boolean> batchUpdateByCarIds(BaseCarDTO baseCarDTO, List<Long> carIds) {
        return null;
    }

    @Override
    public APIResult<List<Long>> queryLimitCar(LimitCarQuery carQuery) {
        return null;
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByCarIdsIncludeDeleted(List<Long> carIds) {
        return null;
    }

    @Override
    public APIResult<List<BaseCarDTO>> getCarsByCarUniquesIncludeDeleted(List<String> carUniques) {
        return null;
    }
}
