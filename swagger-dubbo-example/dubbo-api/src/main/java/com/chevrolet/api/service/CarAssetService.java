package com.chevrolet.api.service;

import com.chevrolet.api.dto.*;
import com.subaru.common.entity.BizResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;
import java.util.Map;

/**
 * Comments：车辆物权接口
 * Author：suclogger
 * Create Date：2017/11/7
 * Modified By：
 * Modified Date：
 * Why & What is modified：
 * Version：v1.0
 * Since: 0.1.7
 */
@Api(description = "车辆物权接口")
public interface CarAssetService {

    /**
     * 物权转移
     *
     * @param transferAssetDTO 传输dto
     * @return 操作结果
     */
    @ApiOperation("物权转移")
    BizResult<Boolean> transferAsset(TransferAssetDTO transferAssetDTO);

    /**
     * 查询物权变更记录
     *
     * @param transferAssetDTO 传输dto
     * @return 操作结果
     */
    @ApiOperation("查询物权变更记录")
    BizResult<Map<Long, List<CarAssetChgLogDTO>>> queryAssetTransferLog(TransferAssetDTO transferAssetDTO);

    /**
     * 车辆物权置为未知
     *
     * @param transferAssetDTO 传输dto
     * @return 操作结果
     */
    @ApiOperation("车辆物权置为未知")
    BizResult<Boolean> releaseAssetRight(TransferAssetDTO transferAssetDTO);

    /**
     * 发起物权变更
     * 1.添加物权变更单，状态【待签章】
     * 2.车辆状态 -> 物权变更中
     */
    @ApiOperation("发起物权变更")
    BizResult<Long> applyAssetRightChg(AssetRightChgApplyDTO assetRightChgApplyDTO);

    /**
     * 签章
     * 1.更新物权变更单状态 【待接收确认】记录sign_time
     * 2.发送接受短信给物权接收人，短信附链接，链接包含物权变更记录详情
     */
    @ApiOperation("签章")
    BizResult<Boolean> signChgRecord(AssetRightChgDTO assetRightChgDTO);

    /**
     * 接收人确认
     * 1.更新物权变更单状态 【已完成】记录confirm_time
     * 2.车辆中心物权转移 （key: 姓名_手机号_身份证号）
     * 匹配规则：
     * 注册用户
     * key匹配，企业匹配 物权 -> 企业id
     * key匹配，企业不匹配 物权 -> 个人id
     * 非注册用户
     * 待用户注册并实名认证后，根据key将车辆从变更单归并到个人名下
     */
    @ApiOperation("接收人确认")
    BizResult<Boolean> confirmChgRecord(AssetRightChgDTO assetRightChgDTO);


    /**
     * 注册后车辆物权信息初始化
     */
    @ApiOperation("注册后车辆物权信息初始化")
    BizResult<Boolean> initAssetRight(AssetRightChgDTO assetRightChgDTO);

    /**
     * 变更单取消
     * 1.物权变更单状态【已取消】
     * 2.车辆物权还原
     */
    @ApiOperation("变更单取消")
    BizResult<Boolean> cancelChgRecord(AssetRightChgDTO assetRightChgDTO);


    @ApiOperation("查询物权变更单")
    BizResult<List<AssetRightChgResultDTO>> queryAssetRightChgRecords(AssetRightChgQueryDTO assetRightChgQueryDTO);

}
