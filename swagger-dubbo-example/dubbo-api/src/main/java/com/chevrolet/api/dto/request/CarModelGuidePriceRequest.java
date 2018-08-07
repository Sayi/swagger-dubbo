package com.chevrolet.api.dto.request;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by suclogger on 2017/5/16.
 */
@Data
public class CarModelGuidePriceRequest implements Serializable {

    private static final long serialVersionUID = 8170604923118224684L;

    private String guidePrice;

    private Integer start = 0;

    private Integer pageSize = 20;

    private Integer status;
}
