package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CarRiskConfirmDTO implements Serializable{

    //车辆id
    private Long carId;

    //照片
    private Long confirmPic;

    //描述
    private String confirmDesc;

}
