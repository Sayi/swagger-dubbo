package com.chevrolet.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author maihe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeriesImageColorDTO implements Serializable {
    private static final long serialVersionUID = -5651358422360046482L;

    //颜色id
    private Long colorId;
    //颜色name
    private String colorName;

}
