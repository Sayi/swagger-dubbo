package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by suclogger on 2017/12/5
 * Modified by
 * Description:
 */
@Data
public class WhiteListVINDTO implements Serializable {

    private String vin;

    private Long brandId;

    private Long seriesId;

    private Long modelId;

}
