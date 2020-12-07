package com.wyj.jk.pojo.po;

public class InnodbLocks {
    private String lockId;

    private String lockTrxId;

    private String lockMode;

    private String lockType;

    private String lockTable;

    private String lockIndex;

    private Long lockSpace;

    private Long lockPage;

    private Long lockRec;

    private String lockData;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getLockTrxId() {
        return lockTrxId;
    }

    public void setLockTrxId(String lockTrxId) {
        this.lockTrxId = lockTrxId;
    }

    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public String getLockTable() {
        return lockTable;
    }

    public void setLockTable(String lockTable) {
        this.lockTable = lockTable;
    }

    public String getLockIndex() {
        return lockIndex;
    }

    public void setLockIndex(String lockIndex) {
        this.lockIndex = lockIndex;
    }

    public Long getLockSpace() {
        return lockSpace;
    }

    public void setLockSpace(Long lockSpace) {
        this.lockSpace = lockSpace;
    }

    public Long getLockPage() {
        return lockPage;
    }

    public void setLockPage(Long lockPage) {
        this.lockPage = lockPage;
    }

    public Long getLockRec() {
        return lockRec;
    }

    public void setLockRec(Long lockRec) {
        this.lockRec = lockRec;
    }

    public String getLockData() {
        return lockData;
    }

    public void setLockData(String lockData) {
        this.lockData = lockData;
    }
}