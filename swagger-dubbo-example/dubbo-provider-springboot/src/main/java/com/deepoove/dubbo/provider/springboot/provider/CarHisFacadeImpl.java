/**
 *  
 *  * All rights Reserved, Designed By www.maihaoche.com
 * <p>
 *  * @Package com.mhc.chevrolet.core.biz
 *  * @author: 三帝（sandi@maihaoche.com）
 *  * @date: 2018-06-22 16:26:31
 *  * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 *  * 注意：本内容仅限于卖好车内部传阅，禁止外泄以及用于其他的商业目
 *  
 */
package com.deepoove.dubbo.provider.springboot.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.chevrolet.api.dto.CarHisDTO;
import com.chevrolet.api.dto.query.CarHisQueryDTO;
import com.chevrolet.api.service.CarHisService;
import com.subaru.common.entity.APIResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**   
  * <p> 车辆信息变更记录表 服务实现类 </p>
 *   
  * @author: 三帝（sandi@maihaoche.com）
  * @date: 2018-06-22 16:26:31
 * @since V1.0
 */
@Service(interfaceClass = CarHisService.class)
public class CarHisFacadeImpl implements CarHisService {


    @Override
    public APIResult<List<CarHisDTO>> queryCarHis(CarHisQueryDTO carHisQuery) {
        return null;
    }
}
