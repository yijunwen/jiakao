package com.wyj.jk.pojo.po;

public class XSchemaTablesWithFullTableScans {
    private String objectSchema;

    private String objectName;

    private Long rowsFullScanned;

    private Long latency;

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

    public Long getRowsFullScanned() {
        return rowsFullScanned;
    }

    public void setRowsFullScanned(Long rowsFullScanned) {
        this.rowsFullScanned = rowsFullScanned;
    }

    public Long getLatency() {
        return latency;
    }

    public void setLatency(Long latency) {
        this.latency = latency;
    }
}