package com.wyj.jk.pojo.po;

public class MutexInstances {
    private String name;

    private Long objectInstanceBegin;

    private Long lockedByThreadId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public Long getLockedByThreadId() {
        return lockedByThreadId;
    }

    public void setLockedByThreadId(Long lockedByThreadId) {
        this.lockedByThreadId = lockedByThreadId;
    }
}