package com.wyj.jk.pojo.po;

public class TableHandles {
    private String objectType;

    private String objectSchema;

    private String objectName;

    private Long objectInstanceBegin;

    private Long ownerThreadId;

    private Long ownerEventId;

    private String internalLock;

    private String externalLock;

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    public Long getOwnerEventId() {
        return ownerEventId;
    }

    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }

    public String getInternalLock() {
        return internalLock;
    }

    public void setInternalLock(String internalLock) {
        this.internalLock = internalLock;
    }

    public String getExternalLock() {
        return externalLock;
    }

    public void setExternalLock(String externalLock) {
        this.externalLock = externalLock;
    }
}