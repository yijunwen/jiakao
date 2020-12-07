package com.wyj.jk.pojo.po;

public class ReplicationGroupMemberStats {
    private String channelName;

    private String viewId;

    private String memberId;

    private Long countTransactionsInQueue;

    private Long countTransactionsChecked;

    private Long countConflictsDetected;

    private Long countTransactionsRowsValidating;

    private String transactionsCommittedAllMembers;

    private String lastConflictFreeTransaction;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Long getCountTransactionsInQueue() {
        return countTransactionsInQueue;
    }

    public void setCountTransactionsInQueue(Long countTransactionsInQueue) {
        this.countTransactionsInQueue = countTransactionsInQueue;
    }

    public Long getCountTransactionsChecked() {
        return countTransactionsChecked;
    }

    public void setCountTransactionsChecked(Long countTransactionsChecked) {
        this.countTransactionsChecked = countTransactionsChecked;
    }

    public Long getCountConflictsDetected() {
        return countConflictsDetected;
    }

    public void setCountConflictsDetected(Long countConflictsDetected) {
        this.countConflictsDetected = countConflictsDetected;
    }

    public Long getCountTransactionsRowsValidating() {
        return countTransactionsRowsValidating;
    }

    public void setCountTransactionsRowsValidating(Long countTransactionsRowsValidating) {
        this.countTransactionsRowsValidating = countTransactionsRowsValidating;
    }

    public String getTransactionsCommittedAllMembers() {
        return transactionsCommittedAllMembers;
    }

    public void setTransactionsCommittedAllMembers(String transactionsCommittedAllMembers) {
        this.transactionsCommittedAllMembers = transactionsCommittedAllMembers;
    }

    public String getLastConflictFreeTransaction() {
        return lastConflictFreeTransaction;
    }

    public void setLastConflictFreeTransaction(String lastConflictFreeTransaction) {
        this.lastConflictFreeTransaction = lastConflictFreeTransaction;
    }
}