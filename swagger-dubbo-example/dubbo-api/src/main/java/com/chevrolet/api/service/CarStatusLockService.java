package com.chevrolet.api.service;

import com.chevrolet.api.dto.CarLockStatusDTO;
import com.chevrolet.api.dto.CarStatusLockResultDTO;
import com.chevrolet.api.dto.request.CarLockReq;
import com.chevrolet.api.enums.lock.CarLockBizTypeEnum;
import com.chevrolet.api.enums.lock.CarLockExtStatusEnum;
import com.subaru.common.entity.BizResult;

import java.util.List;

/**
 * @author maihe
 */
public interface CarStatusLockService {

    //车辆冻结
    BizResult<Boolean> lock(CarLockReq carLockReq);

    //车辆解冻
    BizResult<Boolean> unlock(CarLockReq carLockReq);

    //查询冻结状态
    BizResult<Boolean> isLock(CarLockReq carLockReq);

    BizResult<List<CarStatusLockResultDTO>> queryCarLocks(List<Long> carIds);

    BizResult<List<CarStatusLockResultDTO>> queryCarLocks(List<Long> carIds, List<Integer> types);

    BizResult<List<CarStatusLockResultDTO>> queryCarUniqueLocks(List<String> carUniques);

    BizResult<List<CarStatusLockResultDTO>> queryCarUniqueLocks(List<String> carUniques, List<Integer> types);

    BizResult<List<CarLockStatusDTO>> queryAllCarLocks(List<Long> carIds, List<Integer> types);

    BizResult<Boolean> allowLoanCar(List<Long> carIds, CarLockExtStatusEnum statusEnum);

    BizResult<Boolean> allowLoanCar(List<Long> carIds, CarLockExtStatusEnum statusEnum, List<CarLockBizTypeEnum> carLockBizTypeEnum);

}
