package com.chevrolet.api.message;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author maihe
 */
@Data
@AllArgsConstructor
public class CarAssetChgMessage implements Serializable {
    private static final long serialVersionUID = 8698595630708077170L;
    //物权
    private Long right;
    //物权类型
    private Integer rightType;
    //原物权
    private Long oldRight;
    //原物权类型
    private Integer oldRightType;
    //车辆
    private List<Long> carIds;
}
