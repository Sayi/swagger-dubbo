package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.chevrolet.api.dto.*;
import com.chevrolet.api.service.CarAssetService;
import com.subaru.common.entity.BizResult;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author maihe
 */
@Service(interfaceClass = CarAssetService.class)
public class CarAssetFacadeImpl implements CarAssetService {


    @Override
    public BizResult<Boolean> transferAsset(TransferAssetDTO transferAssetDTO) {
        return null;
    }

    @Override
    public BizResult<Map<Long, List<CarAssetChgLogDTO>>> queryAssetTransferLog(TransferAssetDTO transferAssetDTO) {
        return null;
    }

    @Override
    public BizResult<Boolean> releaseAssetRight(TransferAssetDTO transferAssetDTO) {
        return null;
    }

    @Override
    public BizResult<Long> applyAssetRightChg(AssetRightChgApplyDTO assetRightChgApplyDTO) {
        return null;
    }

    @Override
    public BizResult<Boolean> signChgRecord(AssetRightChgDTO assetRightChgDTO) {
        return null;
    }

    @Override
    public BizResult<Boolean> confirmChgRecord(AssetRightChgDTO assetRightChgDTO) {
        return null;
    }

    @Override
    public BizResult<Boolean> initAssetRight(AssetRightChgDTO assetRightChgDTO) {
        return null;
    }

    @Override
    public BizResult<Boolean> cancelChgRecord(AssetRightChgDTO assetRightChgDTO) {
        return null;
    }

    @Override
    public BizResult<List<AssetRightChgResultDTO>> queryAssetRightChgRecords(AssetRightChgQueryDTO assetRightChgQueryDTO) {
        return null;
    }
}
