package com.chevrolet.api.dto;

import com.mhc.bs.common.base.BaseDTO;
import lombok.Data;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.mhc.chevrolet.api.dto
 * @author: 绪超（xuchao@maihaoche.com）
 * @date: 2018/7/12 下午5:17
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 */
@Data
public class CheckResourceDTO extends BaseDTO {

    /**
     * 验车单ID
     */
    private Long checkIssueId;
    /**
     * 验车项
     */
    private Integer checkItemType;
    /**
     * 资源url
     */
    private String resourceUrl;
    /**
     * 是否异常
     */
    private Integer isAbnormal;
    /**
     * 是否已删除
     */
    private Integer isDeleted;
}
