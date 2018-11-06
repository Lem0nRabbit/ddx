package com.ddx.pojo;

import java.math.BigDecimal;

/**
 * 阶梯价格信息表
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:26:48
 */
public class DdxPriceRange {
    private Integer id;

    private Integer skuId;

    private Integer amountMin;

    private Integer amountMax;

    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getAmountMin() {
        return amountMin;
    }

    public void setAmountMin(Integer amountMin) {
        this.amountMin = amountMin;
    }

    public Integer getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(Integer amountMax) {
        this.amountMax = amountMax;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}