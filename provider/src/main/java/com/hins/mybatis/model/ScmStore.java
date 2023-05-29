package com.hins.mybatis.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ScmStore {
    private Long id;

    private Integer warehouseCompanyId;

    private String warehouseCompanyName;

    private Integer warehouseId;

    private String warehouseName;

    private Short cargoOwnerType;

    private Long cargoOwnerId;

    private String cargoOwnerName;

    private Integer cargoOwnerProvinceId;

    private String cargoOwnerProvinceName;

    private Integer cargoOwnerCityId;

    private String cargoOwnerCityName;

    private Integer cargoOwnerCountyId;

    private String cargoOwnerCountyName;

    private Integer cargoOwnerCompanyId;

    private String cargoOwnerCompanyName;

    private Integer categOneId;

    private Integer categTwoId;

    private String categOneName;

    private String categTwoName;

    private String goodsId;

    private String goodsName;

    private BigDecimal number;

    private BigDecimal availableStock;

    private BigDecimal lockedStock;

    private Integer salePrice;

    private Integer costPrice;

    private Integer poPrice;

    private Integer untaxedPrice;

    private String saleOrderId;

    private Integer packSpecId;

    private String packSpecName;

    private Integer unitId;

    private String unitName;

    private Integer modelId;

    private String modelName;

    private String creater;

    private String updater;

    private Date createTime;

    private Date updateTime;

}