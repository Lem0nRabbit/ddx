package com.ddx.pojo;

import java.util.Date;

/**
 * 队列信息表
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:27:00
 */
public class DdxQueue {
    private Integer id;

    private Byte queueType;

    private String itemKey;

    private String itemParams;

    private Date pushTime;

    private Integer pushBy;

    private Date popTime;

    private String popBy;

    private Date startTime;

    private Date stopTime;

    private Byte state;

    private String reason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getQueueType() {
        return queueType;
    }

    public void setQueueType(Byte queueType) {
        this.queueType = queueType;
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey == null ? null : itemKey.trim();
    }

    public String getItemParams() {
        return itemParams;
    }

    public void setItemParams(String itemParams) {
        this.itemParams = itemParams == null ? null : itemParams.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public Integer getPushBy() {
        return pushBy;
    }

    public void setPushBy(Integer pushBy) {
        this.pushBy = pushBy;
    }

    public Date getPopTime() {
        return popTime;
    }

    public void setPopTime(Date popTime) {
        this.popTime = popTime;
    }

    public String getPopBy() {
        return popBy;
    }

    public void setPopBy(String popBy) {
        this.popBy = popBy == null ? null : popBy.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}