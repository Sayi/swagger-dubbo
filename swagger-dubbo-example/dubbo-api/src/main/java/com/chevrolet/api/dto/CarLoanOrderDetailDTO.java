package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author maihe
 * @date 2017/5/16
 */
@Data
public class CarLoanOrderDetailDTO extends BaseCarDTO implements Serializable{

    private static final long serialVersionUID = -5686775567755442194L;
    //carLoanId
    private Long carLoanId;

    //车押贷订单编号
    private String carLoanOrderNo;

    //拆单子订单号
    private String splitOrderNo;

    //首期核价金额
    private Long pricingAmountFirst;

    //单辆车的垫资金额(分/辆)
    private Long singleLoamount;

    //单辆车的保证金（分/辆）
    private Long singleMaramount;

    //仓库id
    private Long warehouseId;

    //预存仓库id
    private Long preWarehouseId;

    //仓库名称
    private String warehouseName;

    //预存仓库名称
    private String preWarehouseName;

    //物流模式
    private Integer logisticsMode;

    //订单类型
    private Integer loanOrderType;

    //车辆状态
    private Integer carStatus;

    //车辆数量
    private Integer carNumber = 0;

    //元车架号，用来生成虚拟车架号
    private String metaCarUnique;
    //元carId，用来关联tms wms照片
    private Long metaCarId;
    //带现有carId创建carLoan记录
    private List<Long> carIds;

    //目的地省份id
    private Integer destProvinceId;

    //目的地省份name
    private String destProvinceName;

    //目的地城市id
    private Integer destCityId;

    //目的地城市name
    private String destCityName;

    //回款时间
    private Date repayTime;

    //质押率
    private String loanRate;

    //手续照片
    private List<String> imgFormality;

    //是否热销
    private Integer hotModel;

    //行情单价
    private String marketPrice;

    //配置
    private String configure;

    //是否接受验车结果
    private Integer confirmVehicle;

    //是否加装
    private Integer retrofitting;

    //物流结算单号
    private String tmsPaymentNo;

    //仓储结算单号
    private String wmsPaymentNo;

    //每辆车的合同单价
    private Long unitContractPrice;

    //当前操作人id
    private Long currentOperatorId;

    //当前操作人name
    private String currentOperatorName;

    //保证金比率
    private String marginRatio;

    //秒杀字段
    private Integer secondKillFlag;

    //规则保证金
    private Long ruleCalculationBail;

    //备注
    private String comment;

    //是否在库车发起
    private Integer isWmsCarApply;

    //是否显示仓库地址
    private Boolean showWarehouseAdd;
}
