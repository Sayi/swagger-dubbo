package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author maihe
 */
@Data
public class CarStatusLockResultDTO implements Serializable {
    private static final long serialVersionUID = -6698298005389419915L;

    //车辆id
    private Long carId;

    //业务类型
    private Integer bizType;

    //业务单号
    private String bizNo;

    //是否锁定
    private Integer locked;

    //订单宝转库融宝标识
    private Integer ext1;
}
