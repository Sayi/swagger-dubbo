/**
 *  
 *  * All rights Reserved, Designed By www.maihaoche.com
 * <p>
 *  * @Package com.mhc.chevrolet.api
 *  * @author: 三帝（sandi@maihaoche.com）
 *  * @date: 2018-07-12 10:06:03
 *  * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 *  * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 *  
 */
package com.chevrolet.api.service;

import com.chevrolet.api.dto.CheckConfDTO;
import com.chevrolet.api.dto.request.CheckConfRequest;
import com.mhc.bs.common.base.APIResult;

import java.util.List;

/**   
  * <p> 验车服务配置表 服务接口 </p>
 *   
  * @author: 三帝（sandi@maihaoche.com）
  * @date: 2018-07-12 10:06:03
 * @since V1.0
 */
public interface CheckConfFacade {
    /**
     * <p> 根据条件查询验车服务配置 </p>
     * @param checkConfRequest
     * @return APIResult<List < CheckConfDTO>>
     * @throws
     * @author 绪超 (xuchao@maihaoche.com)
     * @date 2018/7/16 下午7:23
     * @since V1.1.0-SNAPSHOT
     *
     */
    APIResult<List<CheckConfDTO>> listCheckConfByRequest(CheckConfRequest checkConfRequest);
}
