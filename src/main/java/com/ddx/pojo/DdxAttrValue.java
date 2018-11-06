package com.ddx.pojo;

/**
 * 商品属性信息表
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:25:43
 */
public class DdxAttrValue {
    private Integer skuId;

    private Integer attrId;

    private String attVal;

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getAttVal() {
        return attVal;
    }

    public void setAttVal(String attVal) {
        this.attVal = attVal == null ? null : attVal.trim();
    }
}