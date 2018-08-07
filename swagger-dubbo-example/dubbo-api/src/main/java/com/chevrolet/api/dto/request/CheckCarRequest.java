package com.chevrolet.api.dto.request;

import com.mhc.bs.common.base.BaseDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.mhc.chevrolet.api.dto.request
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/12 下午5:29
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@Data
public class CheckCarRequest extends BaseDTO {
    /**
     * 车辆中心car_id集合
     */
    private List<Long> carIds;
    /**
     * 业务来源集合
     */
    private List<Integer> bizSource;
    /**
     * 关联的业务单号集合
     */
    private List<String> bizOrderNos;
    /**
     * 终端类型集合
     */
    private List<Integer> checkTerminal;
    /**
     * 验车开始时间
     */
    private Date checkBeginDate;
    /**
     * 验车结束时间集合
     */
    private Date checkEndDate;
    /**
     * 是否有效集合
     */
    private List<Integer> isDeleted;
}
