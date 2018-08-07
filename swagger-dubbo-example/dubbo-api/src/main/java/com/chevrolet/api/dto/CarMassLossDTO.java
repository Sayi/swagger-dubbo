package com.chevrolet.api.dto;

import java.io.Serializable;

/**
 * something
 *
 * @author keben
 * @date 2017/6/16
 */
public class CarMassLossDTO implements Serializable{
    private static final long serialVersionUID = -3096966562062797756L;
    //车辆质损照片
    private String massLossImg;
    //车辆质损备注
    private String remark;

    public String getMassLossImg() {
        return massLossImg;
    }

    public void setMassLossImg(String massLossImg) {
        this.massLossImg = massLossImg;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
