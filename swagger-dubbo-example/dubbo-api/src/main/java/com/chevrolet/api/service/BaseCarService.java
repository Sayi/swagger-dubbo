package com.chevrolet.api.service;

import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.LimitCarQuery;
import com.chevrolet.api.dto.request.BaseCarQueryReq;
import com.subaru.common.entity.APIResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Map;

/**
 * Created by suclogger on 2017/5/15.
 */
@Api(description = "基础车辆服务")
public interface BaseCarService {

    /**
     * 根据车辆ID返回车辆基本信息
     *
     * @param carId
     * @return
     */
    @ApiOperation("根据车辆ID返回车辆基本信息")
    APIResult<BaseCarDTO> getCarById(Long carId);

    /**
     * 批量根据车辆ID返回车辆基本信息
     *
     * @param carIds
     * @return
     */
    APIResult<Map<Long, BaseCarDTO>> getCarsByIds(List<Long> carIds);

    /**
     * 添加基础车辆信息
     *
     * @param baseCarDTO
     * @return
     */
    APIResult<Long> addBaseCar(BaseCarDTO baseCarDTO);

    /**
     * <p> 批量保存基础车辆信息 </p>
     * @param baseCarDTO 车辆信息
     * @param carNumber 要保存的车辆数量
     * @return APIResult<List<Long>> 车辆ID列表
     * @throws       
     * @author 绪超 (xuchao@maihaoche.com)
     * @date 2018/6/26 下午1:47
     * @since V1.1.0-SNAPSHOT
     *
     */
    APIResult<List<Long>> batchSaveCarDTO(BaseCarDTO baseCarDTO, Integer carNumber);

    /**
     * 更新基础车辆信息
     * @param baseCarDTO
     * @return
     */
    APIResult<Boolean> updateBaseCar(BaseCarDTO baseCarDTO);

//    /**
//     * 获取未知模型车辆分页信息
//     * @param req
//     * @return
//     */
//    APIResult<PageInfo<BaseCarDTO>> getPageCarsByModelAndCarIds(BaseCarReq req);

    /**
     * 根据carUnique返回车辆信息
     *
     * created by keben 2017-06-08
     *
     * @param carUnique
     * @return
     */
    APIResult<List<BaseCarDTO>> getCarsByCarUnique(String carUnique);

    /**
     * 根据carUniques返回车辆信息
     *
     * created by keben 2017-06-08
     *
     * @param carUniques
     * @return
     */
    APIResult<List<BaseCarDTO>> getCarsByCarUniques(List<String> carUniques);

    /**
     * 根据carIds返回车辆信息
     *
     * created by keben 2017-06-10
     *
     * @param carIds
     * @return
     */
    APIResult<List<BaseCarDTO>> getCarsByCarIds(List<Long> carIds);

    /**
     * 根据车架号模糊查询车辆
     *
     * created by maihe 2017-07-28
     *
     * @param fuzzyCarUnique
     * @return
     */
    APIResult<List<BaseCarDTO>> getCarsByFuzzyCarUnique(String fuzzyCarUnique);


    /**
     * 查询车辆信息，支持带物权查询
     *
     * created by maihe 2017-07-28
     *
     * @return
     */
    APIResult<List<BaseCarDTO>> queryCarsByQueryReq(BaseCarQueryReq baseCarQueryReq);


    APIResult<Boolean> batchUpdateByCarIds(BaseCarDTO baseCarDTO, List<Long> carIds);

//    APIResult<List<BaseCarDTO>> getCarsWithSuperByCarIds(List<Long> carIds);

    /**
     * 获取从fromCarId开始的n条记录
     * @param carQuery
     * @return
     */
    APIResult<List<Long>> queryLimitCar(LimitCarQuery carQuery);

    /**
     * 根据carIds返回车辆信息,包括已删除的
     * @param carIds
     * @return
     */
    APIResult<List<BaseCarDTO>> getCarsByCarIdsIncludeDeleted(List<Long> carIds);

    /**
     * 根据carUniques返回车辆信息,包括已删除的
     * @param carUniques
     * @return
     */
    APIResult<List<BaseCarDTO>> getCarsByCarUniquesIncludeDeleted(List<String> carUniques);

}
