package com.chevrolet.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author maihe
 */
@Data
public class CarAssetChgLogDTO implements Serializable {
    private static final long serialVersionUID = 6823461376190731145L;

    private Long chglogId;

    private Long oid;

    private Integer oType;

    private Long nid;

    private Integer nType;

    private Long carId;

    private Date gmtCreate;

    private Date gmtModified;
}
