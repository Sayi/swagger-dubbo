package com.chevrolet.api.dto;

import java.io.Serializable;

/**
 * Created by weishuai on 16/1/15.
 */
public class BrandDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 品牌Id
     */
    private Long brandId;

    /**
     * 品牌Icon,展示的是汽车之家的品牌logo
     */
    private String brandPic;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 品牌名称首字母
     */
    private String brandLetter;

    /**
     * 对应 auto pic
     */
    private String smallPic;


    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandPic() {
        return brandPic;
    }

    public void setBrandPic(String brandPic) {
        this.brandPic = brandPic;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLetter() {
        return brandLetter;
    }

    public void setBrandLetter(String brandLetter) {
        this.brandLetter = brandLetter;
    }

}
