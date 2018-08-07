package com.chevrolet.api.service;

import com.chevrolet.api.dto.*;
import com.chevrolet.api.dto.request.CarModelGuidePriceRequest;
import com.chevrolet.api.support.BaseValue;
import com.subaru.common.entity.BizResult;

import java.util.List;
import java.util.Map;

/**
 * Created by suclogger on 2017/5/16.
 * <p>
 * 车辆信息的工具箱应用，包含品牌，车系，车型信息的获取等
 */
public interface CarToolBoxService {

    /**
     * 基础校验车架号
     *
     * @param vin
     * @return 校验结果
     */
    BizResult<Boolean> verifyVIN(String vin);


    /**
     * 批量校验车架号
     *
     * @param vins 车架号
     * @return 校验结果
     */
    BizResult<Map<String, Boolean>> verifyVINBatch(List<String> vins);

    /**
     * 根据车架号返回车型信息
     */
    BizResult<ModelDTO> getModelByVIN(String vin);

    /**
     * 获取所有品牌
     *
     * @return
     */
    BizResult<List<BrandDTO>> getAllBrand();

    /**
     * 根据系列Id获取车型
     *
     * @param seriesId
     * @return
     */
    BizResult<List<ModelDTO>> getModelsBySeriesId(Long seriesId);

    /**
     * 通过品牌ID列表获取指定的品牌
     *
     * @param ids
     * @return
     */
    BizResult<List<BrandDTO>> getBrandListByIds(List<Long> ids);

    /**
     * 通过车系ID列表获取指定的车系列表
     *
     * @param ids
     * @return
     */
    BizResult<List<SeriesDTO>> getSeriesListByIds(List<Long> ids);

    /**
     * 根据主键查询车厂
     *
     * @param factoryId
     * @return
     */
    BizResult<FactoryDTO> getFactoryById(Long factoryId);

    /**
     * 根据品牌ID查询品牌信息
     *
     * @param brandId
     * @return
     */
    BizResult<BrandDTO> getBrandByBrandId(Long brandId);

    /**
     * 根据车规获取品牌
     *
     * @param standard
     * @return
     */
    BizResult<List<BrandDTO>> getBrandListByStandard(Integer standard);
    /**
     * 查询所以有效的系列 包括没有车的
     *
     * @param brandId
     * @return
     */
    BizResult<List<SeriesDTO>> getAllSeriesByBrandId(Long brandId);

    /**
     * 根据车系ID查询车系信息
     *
     * @param seriesId
     * @return
     */
    BizResult<SeriesDTO> getSeriesBySeriesId(Long seriesId);

    /**
     * 根据指导价获取车型(仅限国产和中规)
     *
     * @param guidePrice
     * @return
     */
    BizResult<List<ModelDTO>> getSellingModelsByGuidePrice(String guidePrice);

    /**
     * 根据指导价获取车型(仅限国产和中规) (分页)
     *
     * @param request
     * @return
     */
    BizResult<List<ModelDTO>> getSellingModelsByGuidePriceWithPage(CarModelGuidePriceRequest request);

    /**
     * 根据车型ID获取车型
     *
     * @param modelId
     * @return
     */
    BizResult<ModelDTO> getModelByModelId(Long modelId);


    /**
     * 根据车型ID获取车型（详细）
     *
     * @param modelId
     * @return
     */
    BizResult<ModelDetailDTO> getDetailModelByModelId(Long modelId);


    /**
     * 通过车型名获取车型
     *
     * @param modelName
     * @return
     */
    BizResult<ModelDetailDTO> getDetailModelByName(String modelName);


    /**
     * 根据指导价查找车型(不过滤状态)
     *
     * @param guidePrice
     * @return
     */
    BizResult<List<ModelDTO>> getModelsByGuidePrice(String guidePrice);

    /**
     * 根据指导价查找车型(不过滤状态)(分页)
     *
     * @param request
     * @return
     */
    BizResult<List<ModelDTO>> getModelsByGuidePriceWithPage(CarModelGuidePriceRequest request);

    /**
     * 添加车型
     *
     * @param modelDetailDTO
     * @return
     */
    BizResult<Boolean> addModel(ModelDetailDTO modelDetailDTO);


    /**
     * 添加白名单车架号
     *
     * @return 添加成功或者失败
     */
    BizResult<Boolean> addWhiteListVIN(WhiteListVINDTO whiteListVINDTO);


    /**
     * 根据车系获取外观内饰颜色
     */
    BizResult<Map<String,List<SeriesImageColorDTO>>> getColorsBySeriesId(Long seriesId);

    /**
     * 根据车系获取外观内饰颜色
     */
    BizResult<List<SeriesImageColorDTO>> getSeriesImageBySeriesIdAndType(Long seriesId, Integer type);

    /**
     * 根据color id 获取颜色
     */
    BizResult<SeriesImageColorDTO> getSeriesImageByColorId(Long colorId);


    /**
     * 根据车系，车规，外观内饰类型获取车辆颜色
     */
    BizResult<List<SeriesImageColorDTO>> getSeriesImageBySeriesIdAndType(Long seriesId, Integer type, Integer standard);

    /**
     * 根据 车规、品牌ID、状态 获取车系
     * @param brandId
     * @param standard
     * @param status
     * @return
     */
    BizResult<List<SeriesDTO>> getSeriesList(Long brandId, Integer standard, Integer status);


    /**
     * 根据品牌查询有车的车系
     *
     * @param brandId
     * @return
     */
    BizResult<List<SeriesDTO>> getHasCarSeriesByBrandId(Long brandId);

    /**
     * 获取有车源的品牌
     * @return
     */
    BizResult<List<BrandDTO>> getAllBrandWithCars();


    /**
     * 根据 车系ID、车规、状态 获取车型
     * @param seriesId
     * @param standard
     * @return
     */
    BizResult<List<ModelDTO>> getModelList(Long seriesId, Integer standard, Integer status);


    /**
     * 获取秒车库热门品牌
     */
    BizResult<List<BrandDTO>> getSecKillProductHotBrandListByName(List<String> brandNameList);

    /**
     * 根据指导价查找车型(不过滤状态)(分页)
     *
     * @param request
     * @return
     */
    BizResult<List<ModelDTO>> getModelsByGuidePriceAndStatusWithPage(CarModelGuidePriceRequest request);

    /**
     * 根据车规获取所有有车系的品牌
     *
     * @param standard
     * @return
     */
    BizResult<List<BrandDTO>> getBrandListWithSeries(Integer standard);

    /**
     * 根据车系id获取对应的外观内饰
     *
     * @param seriesId
     * @return
     */
    BizResult<Map<String, List<BaseValue>>> getTrimAndFacade(long seriesId);

    /**
     * 获取所有存在有效系列的品牌
     * @return
     */
    BizResult<List<BrandDTO>> getAllValidSeriesBrand();

    /**
     * 根据系列ID获取有车牌的系列
     * @param seriesId
     * @return
     */
    BizResult<SeriesDTO> getSeriesHasBrandBySeriesId(Long seriesId);

    /**
     * status为1的查询
     * @return
     */
    BizResult<List<ModelDTO>> getModelsByGuidePriceByStatus(String guidePrice);

}
