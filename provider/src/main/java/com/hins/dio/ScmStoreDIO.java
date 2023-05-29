package com.hins.dio;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author PanHao
 * @date 2023/5/26 16:06
 */
@Data
public class ScmStoreDIO implements Serializable {

    private Long cargoOwnerId;

    private String goodsId;

    private Long id;

    private BigDecimal number;

    private BigDecimal availableStock;

    private BigDecimal lockedStock;

    private BigDecimal deductionAmount;


}
