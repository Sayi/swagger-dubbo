/**
 *  
 *  * All rights Reserved, Designed By www.maihaoche.com
 * <p>
 *  * @Package com.mhc.chevrolet.core.biz
 *  * @author: 三帝（sandi@maihaoche.com）
 *  * @date: 2018-07-12 10:06:03
 *  * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 *  * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 *  
 */
package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.chevrolet.api.dto.CheckConfDTO;
import com.chevrolet.api.dto.request.CheckConfRequest;
import com.chevrolet.api.service.CheckConfFacade;
import com.mhc.bs.common.base.APIResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**   
  * <p> 验车服务配置表 服务实现类 </p>
 *   
  * @author: 三帝（sandi@maihaoche.com）
  * @date: 2018-07-12 10:06:03
 * @since V1.0
 */
@Service(interfaceClass = CheckConfFacade.class)
public class CheckConfFacadeImpl implements CheckConfFacade {


    @Override
    public APIResult<List<CheckConfDTO>> listCheckConfByRequest(CheckConfRequest checkConfRequest) {
        return null;
    }
}
