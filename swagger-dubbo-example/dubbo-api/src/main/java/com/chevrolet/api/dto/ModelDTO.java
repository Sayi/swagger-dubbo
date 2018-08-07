package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by weishuai on 16/1/15.
 */
@Data
public class ModelDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 型号ID
	 */
	private Long modelId;

	/**
	 * 型号名称
	 */
	private String modelName;

	/**
	 * 型号对应的系列ID
	 */
	private Long seriesId;

	/**
	 * 系列名称
	 */
	private String seriesName;

	/**
	 * 型号对应的品牌ID
	 */
	private Long brandId;

	/**
	 * 品牌名称
	 */
	private String brandName;

	/**
	 * 车规
	 */
	private Integer spec;

	/**
	 * 指导价
	 */
	private String guidePrice;

	/**
	 * 品牌图片
	 */
	private String brandPic;

	/**
	 * 状态,1-在售,2-即将在售,3-停售
	 */
	private Integer status;

	public ModelDTO() {
	}

	public ModelDTO(String modelName, String seriesName, String brandName, String guidePrice) {
		this.modelName = modelName;
		this.seriesName = seriesName;
		this.brandName = brandName;
		this.guidePrice = guidePrice;
	}
}
