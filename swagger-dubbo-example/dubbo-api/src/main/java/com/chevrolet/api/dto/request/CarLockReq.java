package com.chevrolet.api.dto.request;

import com.chevrolet.api.enums.lock.CarLockBizTypeEnum;
import com.chevrolet.api.enums.lock.CarLockExtStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author maihe
 */
@Data
public class CarLockReq implements Serializable {
    private static final long serialVersionUID = -7988854138569182261L;
    //车辆id
    private Long carId;

    //批量加锁时传carIds
    private List<Long> carIds;

    //业务类型
    private CarLockBizTypeEnum bizType;
    //业务no
    private String bizNo;

    private Date expireTime;

    private CarLockExtStatusEnum ext1;
}
