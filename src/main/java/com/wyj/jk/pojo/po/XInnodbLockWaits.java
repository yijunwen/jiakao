package com.wyj.jk.pojo.po;

import java.util.Date;

public class XInnodbLockWaits {
    private Date waitStarted;

    private Date waitAge;

    private Long waitAgeSecs;

    private String lockedTable;

    private String lockedIndex;

    private String lockedType;

    private String waitingTrxId;

    private Date waitingTrxStarted;

    private Date waitingTrxAge;

    private Long waitingTrxRowsLocked;

    private Long waitingTrxRowsModified;

    private Long waitingPid;

    private String waitingQuery;

    private String waitingLockId;

    private String waitingLockMode;

    private String blockingTrxId;

    private Long blockingPid;

    private String blockingQuery;

    private String blockingLockId;

    private String blockingLockMode;

    private Date blockingTrxStarted;

    private Date blockingTrxAge;

    private Long blockingTrxRowsLocked;

    private Long blockingTrxRowsModified;

    private String sqlKillBlockingQuery;

    private String sqlKillBlockingConnection;

    public Date getWaitStarted() {
        return waitStarted;
    }

    public void setWaitStarted(Date waitStarted) {
        this.waitStarted = waitStarted;
    }

    public Date getWaitAge() {
        return waitAge;
    }

    public void setWaitAge(Date waitAge) {
        this.waitAge = waitAge;
    }

    public Long getWaitAgeSecs() {
        return waitAgeSecs;
    }

    public void setWaitAgeSecs(Long waitAgeSecs) {
        this.waitAgeSecs = waitAgeSecs;
    }

    public String getLockedTable() {
        return lockedTable;
    }

    public void setLockedTable(String lockedTable) {
        this.lockedTable = lockedTable;
    }

    public String getLockedIndex() {
        return lockedIndex;
    }

    public void setLockedIndex(String lockedIndex) {
        this.lockedIndex = lockedIndex;
    }

    public String getLockedType() {
        return lockedType;
    }

    public void setLockedType(String lockedType) {
        this.lockedType = lockedType;
    }

    public String getWaitingTrxId() {
        return waitingTrxId;
    }

    public void setWaitingTrxId(String waitingTrxId) {
        this.waitingTrxId = waitingTrxId;
    }

    public Date getWaitingTrxStarted() {
        return waitingTrxStarted;
    }

    public void setWaitingTrxStarted(Date waitingTrxStarted) {
        this.waitingTrxStarted = waitingTrxStarted;
    }

    public Date getWaitingTrxAge() {
        return waitingTrxAge;
    }

    public void setWaitingTrxAge(Date waitingTrxAge) {
        this.waitingTrxAge = waitingTrxAge;
    }

    public Long getWaitingTrxRowsLocked() {
        return waitingTrxRowsLocked;
    }

    public void setWaitingTrxRowsLocked(Long waitingTrxRowsLocked) {
        this.waitingTrxRowsLocked = waitingTrxRowsLocked;
    }

    public Long getWaitingTrxRowsModified() {
        return waitingTrxRowsModified;
    }

    public void setWaitingTrxRowsModified(Long waitingTrxRowsModified) {
        this.waitingTrxRowsModified = waitingTrxRowsModified;
    }

    public Long getWaitingPid() {
        return waitingPid;
    }

    public void setWaitingPid(Long waitingPid) {
        this.waitingPid = waitingPid;
    }

    public String getWaitingQuery() {
        return waitingQuery;
    }

    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    public String getWaitingLockId() {
        return waitingLockId;
    }

    public void setWaitingLockId(String waitingLockId) {
        this.waitingLockId = waitingLockId;
    }

    public String getWaitingLockMode() {
        return waitingLockMode;
    }

    public void setWaitingLockMode(String waitingLockMode) {
        this.waitingLockMode = waitingLockMode;
    }

    public String getBlockingTrxId() {
        return blockingTrxId;
    }

    public void setBlockingTrxId(String blockingTrxId) {
        this.blockingTrxId = blockingTrxId;
    }

    public Long getBlockingPid() {
        return blockingPid;
    }

    public void setBlockingPid(Long blockingPid) {
        this.blockingPid = blockingPid;
    }

    public String getBlockingQuery() {
        return blockingQuery;
    }

    public void setBlockingQuery(String blockingQuery) {
        this.blockingQuery = blockingQuery;
    }

    public String getBlockingLockId() {
        return blockingLockId;
    }

    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId;
    }

    public String getBlockingLockMode() {
        return blockingLockMode;
    }

    public void setBlockingLockMode(String blockingLockMode) {
        this.blockingLockMode = blockingLockMode;
    }

    public Date getBlockingTrxStarted() {
        return blockingTrxStarted;
    }

    public void setBlockingTrxStarted(Date blockingTrxStarted) {
        this.blockingTrxStarted = blockingTrxStarted;
    }

    public Date getBlockingTrxAge() {
        return blockingTrxAge;
    }

    public void setBlockingTrxAge(Date blockingTrxAge) {
        this.blockingTrxAge = blockingTrxAge;
    }

    public Long getBlockingTrxRowsLocked() {
        return blockingTrxRowsLocked;
    }

    public void setBlockingTrxRowsLocked(Long blockingTrxRowsLocked) {
        this.blockingTrxRowsLocked = blockingTrxRowsLocked;
    }

    public Long getBlockingTrxRowsModified() {
        return blockingTrxRowsModified;
    }

    public void setBlockingTrxRowsModified(Long blockingTrxRowsModified) {
        this.blockingTrxRowsModified = blockingTrxRowsModified;
    }

    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection;
    }
}