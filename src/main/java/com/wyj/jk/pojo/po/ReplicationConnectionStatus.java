package com.wyj.jk.pojo.po;

import java.util.Date;

public class ReplicationConnectionStatus {
    private String channelName;

    private String groupName;

    private String sourceUuid;

    private Long threadId;

    private String serviceState;

    private Long countReceivedHeartbeats;

    private Date lastHeartbeatTimestamp;

    private Integer lastErrorNumber;

    private String lastErrorMessage;

    private Date lastErrorTimestamp;

    private String receivedTransactionSet;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSourceUuid() {
        return sourceUuid;
    }

    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
    }

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public String getServiceState() {
        return serviceState;
    }

    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    public Long getCountReceivedHeartbeats() {
        return countReceivedHeartbeats;
    }

    public void setCountReceivedHeartbeats(Long countReceivedHeartbeats) {
        this.countReceivedHeartbeats = countReceivedHeartbeats;
    }

    public Date getLastHeartbeatTimestamp() {
        return lastHeartbeatTimestamp;
    }

    public void setLastHeartbeatTimestamp(Date lastHeartbeatTimestamp) {
        this.lastHeartbeatTimestamp = lastHeartbeatTimestamp;
    }

    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    public void setLastErrorNumber(Integer lastErrorNumber) {
        this.lastErrorNumber = lastErrorNumber;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    public Date getLastErrorTimestamp() {
        return lastErrorTimestamp;
    }

    public void setLastErrorTimestamp(Date lastErrorTimestamp) {
        this.lastErrorTimestamp = lastErrorTimestamp;
    }

    public String getReceivedTransactionSet() {
        return receivedTransactionSet;
    }

    public void setReceivedTransactionSet(String receivedTransactionSet) {
        this.receivedTransactionSet = receivedTransactionSet;
    }
}