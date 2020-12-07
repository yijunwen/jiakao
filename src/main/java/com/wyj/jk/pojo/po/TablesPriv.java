package com.wyj.jk.pojo.po;

import java.util.Date;

public class TablesPriv {
    private String host;

    private String db;

    private String user;

    private String tableName;

    private String grantor;

    private Date timestamp;

    private String tablePriv;

    private String columnPriv;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getTablePriv() {
        return tablePriv;
    }

    public void setTablePriv(String tablePriv) {
        this.tablePriv = tablePriv;
    }

    public String getColumnPriv() {
        return columnPriv;
    }

    public void setColumnPriv(String columnPriv) {
        this.columnPriv = columnPriv;
    }
}