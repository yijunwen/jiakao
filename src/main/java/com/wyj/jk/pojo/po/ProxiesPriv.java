package com.wyj.jk.pojo.po;

import java.util.Date;

public class ProxiesPriv {
    private String host;

    private String user;

    private String proxiedHost;

    private String proxiedUser;

    private Boolean withGrant;

    private String grantor;

    private Date timestamp;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProxiedHost() {
        return proxiedHost;
    }

    public void setProxiedHost(String proxiedHost) {
        this.proxiedHost = proxiedHost;
    }

    public String getProxiedUser() {
        return proxiedUser;
    }

    public void setProxiedUser(String proxiedUser) {
        this.proxiedUser = proxiedUser;
    }

    public Boolean getWithGrant() {
        return withGrant;
    }

    public void setWithGrant(Boolean withGrant) {
        this.withGrant = withGrant;
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
}