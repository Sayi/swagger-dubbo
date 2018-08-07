/**  
 * All rights Reserved, Designed By www.maihaoche.com
 * 
 * @Package com.mhc.chevrolet.core.biz
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-06-22 16:26:31
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved. 
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */ 
package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.chevrolet.api.dto.CarLockStatusDTO;
import com.chevrolet.api.dto.CarStatusLockResultDTO;
import com.chevrolet.api.dto.request.CarLockReq;
import com.chevrolet.api.enums.lock.CarLockBizTypeEnum;
import com.chevrolet.api.enums.lock.CarLockExtStatusEnum;
import com.subaru.common.entity.BizResult;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**   
 * <p> 车辆锁 服务实现类 </p>
 *   
 * @author: 三帝（sandi@maihaoche.com）
 * @date: 2018-06-22 16:26:31
 * @since V1.0 
 */
@Service(interfaceClass = com.chevrolet.api.service.CarStatusLockService.class)
public class CarStatusLockFacadeImpl implements com.chevrolet.api.service.CarStatusLockService {


	@Override
	public BizResult<Boolean> lock(CarLockReq carLockReq) {
		return null;
	}

	@Override
	public BizResult<Boolean> unlock(CarLockReq carLockReq) {
		return null;
	}

	@Override
	public BizResult<Boolean> isLock(CarLockReq carLockReq) {
		return null;
	}

	@Override
	public BizResult<List<CarStatusLockResultDTO>> queryCarLocks(List<Long> carIds) {
		return null;
	}

	@Override
	public BizResult<List<CarStatusLockResultDTO>> queryCarLocks(List<Long> carIds, List<Integer> types) {
		return null;
	}

	@Override
	public BizResult<List<CarStatusLockResultDTO>> queryCarUniqueLocks(List<String> carUniques) {
		return null;
	}

	@Override
	public BizResult<List<CarStatusLockResultDTO>> queryCarUniqueLocks(List<String> carUniques, List<Integer> types) {
		return null;
	}

	@Override
	public BizResult<List<CarLockStatusDTO>> queryAllCarLocks(List<Long> carIds, List<Integer> types) {
		return null;
	}

	@Override
	public BizResult<Boolean> allowLoanCar(List<Long> carIds, CarLockExtStatusEnum statusEnum) {
		return null;
	}

	@Override
	public BizResult<Boolean> allowLoanCar(List<Long> carIds, CarLockExtStatusEnum statusEnum, List<CarLockBizTypeEnum> carLockBizTypeEnum) {
		return null;
	}
}
