package com.chevrolet.api.service;

import com.chevrolet.api.dto.BaseCarDTO;
import com.chevrolet.api.dto.LimitCarQuery;
import com.chevrolet.api.dto.request.BaseCarQueryReq;
import com.subaru.common.entity.APIResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

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
    APIResult<BaseCarDTO> getCarById(@ApiParam(value = "基础车id")Long carId);

    /**
     * 批量根据车辆ID返回车辆基本信息
     *
     * @param carIds
     * @return
     */
    @ApiOperation("批量根据车辆ID返回车辆基本信息")
    APIResult<Map<Long, BaseCarDTO>> getCarsByIds(@ApiParam(value = "基础车id列表")List<Long> carIds);

    /**
     * 添加基础车辆信息
     *
     * @param baseCarDTO
     * @return
     */
    @ApiOperation("添加基础车辆信息")
    APIResult<Long> addBaseCar(@ApiParam(value = "基础车信息")BaseCarDTO baseCarDTO);

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
    @ApiOperation("批量保存基础车辆信息")
    APIResult<List<Long>> batchSaveCarDTO(@ApiParam(value = "基础车信息")BaseCarDTO baseCarDTO, @ApiParam(value = "要保存的车辆数量")Integer carNumber);

    /**
     * 更新基础车辆信息
     * @param baseCarDTO
     * @return
     */
    @ApiOperation("更新基础车辆信息")
    APIResult<Boolean> updateBaseCar(@ApiParam(value = "基础车信息")BaseCarDTO baseCarDTO);

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
    @ApiOperation("根据carUnique返回车辆信息")
    APIResult<List<BaseCarDTO>> getCarsByCarUnique(@ApiParam(value = "车架号")String carUnique);

    /**
     * 根据carUniques返回车辆信息
     *
     * created by keben 2017-06-08
     *
     * @param carUniques
     * @return
     */
    @ApiOperation("根据carUniques返回车辆信息")
    APIResult<List<BaseCarDTO>> getCarsByCarUniques(@ApiParam(value = "车架号列表")List<String> carUniques);

    /**
     * 根据carIds返回车辆信息
     *
     * created by keben 2017-06-10
     *
     * @param carIds
     * @return
     */
    @ApiOperation("根据carIds返回车辆信息")
    APIResult<List<BaseCarDTO>> getCarsByCarIds(@ApiParam(value = "基础车id列表")List<Long> carIds);

    /**
     * 根据车架号模糊查询车辆
     *
     * created by maihe 2017-07-28
     *
     * @param fuzzyCarUnique
     * @return
     */
    @ApiOperation("根据车架号模糊查询车辆")
    APIResult<List<BaseCarDTO>> getCarsByFuzzyCarUnique(@ApiParam(value = "模糊车架号")String fuzzyCarUnique);


    /**
     * 查询车辆信息，支持带物权查询
     *
     * created by maihe 2017-07-28
     *
     * @return
     */
    @ApiOperation("查询车辆信息，支持带物权查询")
    APIResult<List<BaseCarDTO>> queryCarsByQueryReq(@ApiParam(value = "基础车辆请求对象")BaseCarQueryReq baseCarQueryReq);

    @ApiOperation("批量更新基础车辆信息")
    APIResult<Boolean> batchUpdateByCarIds(@ApiParam(value = "基础车辆信息")BaseCarDTO baseCarDTO, @ApiParam(value = "基础车id列表")List<Long> carIds);

//    APIResult<List<BaseCarDTO>> getCarsWithSuperByCarIds(List<Long> carIds);

    /**
     * 获取从fromCarId开始的n条记录
     * @param carQuery
     * @return
     */
    @ApiOperation("获取从fromCarId开始的n条记录")
    APIResult<List<Long>> queryLimitCar(@ApiParam(value = "基础车辆请求对象")LimitCarQuery carQuery);

    /**
     * 根据carIds返回车辆信息,包括已删除的
     * @param carIds
     * @return
     */
    @ApiOperation("根据carIds返回车辆信息,包括已删除的")
    APIResult<List<BaseCarDTO>> getCarsByCarIdsIncludeDeleted(@ApiParam(value = "基础车id列表")List<Long> carIds);

    /**
     * 根据carUniques返回车辆信息,包括已删除的
     * @param carUniques
     * @return
     */
    @ApiOperation("根据carUniques返回车辆信息,包括已删除的")
    APIResult<List<BaseCarDTO>> getCarsByCarUniquesIncludeDeleted(@ApiParam(value = "车架号列表")List<String> carUniques);

}
