package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.chevrolet.api.dto.*;
import com.chevrolet.api.dto.request.CarModelGuidePriceRequest;
import com.chevrolet.api.service.CarToolBoxService;
import com.chevrolet.api.support.BaseValue;
import com.subaru.common.entity.BizResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.mhc.chevrolet.core.biz
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/3 上午11:16
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@Service(interfaceClass = CarToolBoxService.class)
public class CarToolBoxFacadeImpl implements CarToolBoxService {


    @Override
    public BizResult<Boolean> verifyVIN(String vin) {
        return null;
    }

    @Override
    public BizResult<Map<String, Boolean>> verifyVINBatch(List<String> vins) {
        return null;
    }

    @Override
    public BizResult<ModelDTO> getModelByVIN(String vin) {
        return null;
    }

    @Override
    public BizResult<List<BrandDTO>> getAllBrand() {
        return null;
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsBySeriesId(Long seriesId) {
        return null;
    }

    @Override
    public BizResult<List<BrandDTO>> getBrandListByIds(List<Long> ids) {
        return null;
    }

    @Override
    public BizResult<List<SeriesDTO>> getSeriesListByIds(List<Long> ids) {
        return null;
    }

    @Override
    public BizResult<FactoryDTO> getFactoryById(Long factoryId) {
        return null;
    }

    @Override
    public BizResult<BrandDTO> getBrandByBrandId(Long brandId) {
        return null;
    }

    @Override
    public BizResult<List<BrandDTO>> getBrandListByStandard(Integer standard) {
        return null;
    }

    @Override
    public BizResult<List<SeriesDTO>> getAllSeriesByBrandId(Long brandId) {
        return null;
    }

    @Override
    public BizResult<SeriesDTO> getSeriesBySeriesId(Long seriesId) {
        return null;
    }

    @Override
    public BizResult<List<ModelDTO>> getSellingModelsByGuidePrice(String guidePrice) {
        return null;
    }

    @Override
    public BizResult<List<ModelDTO>> getSellingModelsByGuidePriceWithPage(CarModelGuidePriceRequest request) {
        return null;
    }

    @Override
    public BizResult<ModelDTO> getModelByModelId(Long modelId) {
        return null;
    }

    @Override
    public BizResult<ModelDetailDTO> getDetailModelByModelId(Long modelId) {
        return null;
    }

    @Override
    public BizResult<ModelDetailDTO> getDetailModelByName(String modelName) {
        return null;
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsByGuidePrice(String guidePrice) {
        return null;
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsByGuidePriceWithPage(CarModelGuidePriceRequest request) {
        return null;
    }

    @Override
    public BizResult<Boolean> addModel(ModelDetailDTO modelDetailDTO) {
        return null;
    }

    @Override
    public BizResult<Boolean> addWhiteListVIN(WhiteListVINDTO whiteListVINDTO) {
        return null;
    }

    @Override
    public BizResult<Map<String, List<SeriesImageColorDTO>>> getColorsBySeriesId(Long seriesId) {
        return null;
    }

    @Override
    public BizResult<List<SeriesImageColorDTO>> getSeriesImageBySeriesIdAndType(Long seriesId, Integer type) {
        return null;
    }

    @Override
    public BizResult<SeriesImageColorDTO> getSeriesImageByColorId(Long colorId) {
        return null;
    }

    @Override
    public BizResult<List<SeriesImageColorDTO>> getSeriesImageBySeriesIdAndType(Long seriesId, Integer type, Integer standard) {
        return null;
    }

    @Override
    public BizResult<List<SeriesDTO>> getSeriesList(Long brandId, Integer standard, Integer status) {
        return null;
    }

    @Override
    public BizResult<List<SeriesDTO>> getHasCarSeriesByBrandId(Long brandId) {
        return null;
    }

    @Override
    public BizResult<List<BrandDTO>> getAllBrandWithCars() {
        return null;
    }

    @Override
    public BizResult<List<ModelDTO>> getModelList(Long seriesId, Integer standard, Integer status) {
        return null;
    }

    @Override
    public BizResult<List<BrandDTO>> getSecKillProductHotBrandListByName(List<String> brandNameList) {
        return null;
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsByGuidePriceAndStatusWithPage(CarModelGuidePriceRequest request) {
        return null;
    }

    @Override
    public BizResult<List<BrandDTO>> getBrandListWithSeries(Integer standard) {
        return null;
    }

    @Override
    public BizResult<Map<String, List<BaseValue>>> getTrimAndFacade(long seriesId) {
        return null;
    }

    @Override
    public BizResult<List<BrandDTO>> getAllValidSeriesBrand() {
        return null;
    }

    @Override
    public BizResult<SeriesDTO> getSeriesHasBrandBySeriesId(Long seriesId) {
        return null;
    }

    @Override
    public BizResult<List<ModelDTO>> getModelsByGuidePriceByStatus(String guidePrice) {
        return null;
    }
}
