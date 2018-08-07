package com.chevrolet.api.dto;

import com.mhc.bs.common.base.BaseDTO;
import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Date;
import java.util.List;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.mhc.chevrolet.api.dto
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/12 下午5:05
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@Data
public class CheckCarDTO extends BaseDTO {

    /**
     * 验车单ID
     */
    private Long checkIssueId;
    /**
     * 车辆中心car_id
     */
    private Long ccCarId;
    /**
     * 业务来源
     */
    private Integer bizSource;
    /**
     * 业务类型
     */
    private Integer bizType;
    /**
     * 关联的业务单号
     */
    private String bizOrderNo;
    /**
     * 用什么端完成的验车
     */
    private Integer checkTerminal;
    /**
     * 验车开始时间
     */
    private Date checkBeginDate;
    ;
    /**
     * 验车结束时间
     */
    private Date checkEndDate;
    /**
     * 验车人工号
     */
    private Long checkerStaffId;
    /**
     * 验车人姓名
     */
    private String checkerName;
    /**
     * 生产日期
     */
    private String productionDate;
    /**
     * 里程数
     */
    private Double odometer;
    /**
     * 钥匙数量
     */
    private Integer keyCount;
    /**
     * 是否有关单
     */
    private Integer customsClearanceStatus;
    /**
     * 一致性证书
     */
    private Integer hasCertificateConformity;
    /**
     * 商检单
     */
    private Integer hasCommodityInspection;
    /**
     * 是否有说明书
     */
    private Integer hasInstructionBook;
    /**
     * 说明书
     */
    private String remark;
    /**
     * 是否已删除
     */
    private Integer isDeleted;
    /**
     * 验车资源列表
     */
    private List<CheckResourceDTO> checkResourceList;
    /**
     * 记录操作人员ID
     */
    private Integer operatorId;
    /**
     * 记录操作人员姓名
     */
    private String operatorName;

}
