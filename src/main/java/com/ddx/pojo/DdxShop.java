package com.ddx.pojo;

import java.util.Date;

/**
 * 店铺信息表
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:27:11
 */
public class DdxShop {
    private Integer id;

    private String platformId;

    private String accessToken;

    private Date accessExpired;

    private String refreshToken;

    private Date refreshExpired;

    private String url;

    private String description;

    private Integer senderId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public Date getAccessExpired() {
        return accessExpired;
    }

    public void setAccessExpired(Date accessExpired) {
        this.accessExpired = accessExpired;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
    }

    public Date getRefreshExpired() {
        return refreshExpired;
    }

    public void setRefreshExpired(Date refreshExpired) {
        this.refreshExpired = refreshExpired;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }
}