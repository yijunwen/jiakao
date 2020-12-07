package com.wyj.jk.pojo.po;

public class ReplicationApplierConfiguration {
    private String channelName;

    private Integer desiredDelay;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getDesiredDelay() {
        return desiredDelay;
    }

    public void setDesiredDelay(Integer desiredDelay) {
        this.desiredDelay = desiredDelay;
    }
}