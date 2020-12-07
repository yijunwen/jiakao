package com.wyj.jk.pojo.po;

public class ReplicationConnectionConfiguration {
    private String channelName;

    private String host;

    private Integer port;

    private String user;

    private String networkInterface;

    private String autoPosition;

    private String sslAllowed;

    private String sslCaFile;

    private String sslCaPath;

    private String sslCertificate;

    private String sslCipher;

    private String sslKey;

    private String sslVerifyServerCertificate;

    private String sslCrlFile;

    private String sslCrlPath;

    private Integer connectionRetryInterval;

    private Long connectionRetryCount;

    private Double heartbeatInterval;

    private String tlsVersion;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNetworkInterface() {
        return networkInterface;
    }

    public void setNetworkInterface(String networkInterface) {
        this.networkInterface = networkInterface;
    }

    public String getAutoPosition() {
        return autoPosition;
    }

    public void setAutoPosition(String autoPosition) {
        this.autoPosition = autoPosition;
    }

    public String getSslAllowed() {
        return sslAllowed;
    }

    public void setSslAllowed(String sslAllowed) {
        this.sslAllowed = sslAllowed;
    }

    public String getSslCaFile() {
        return sslCaFile;
    }

    public void setSslCaFile(String sslCaFile) {
        this.sslCaFile = sslCaFile;
    }

    public String getSslCaPath() {
        return sslCaPath;
    }

    public void setSslCaPath(String sslCaPath) {
        this.sslCaPath = sslCaPath;
    }

    public String getSslCertificate() {
        return sslCertificate;
    }

    public void setSslCertificate(String sslCertificate) {
        this.sslCertificate = sslCertificate;
    }

    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    public String getSslKey() {
        return sslKey;
    }

    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    public String getSslVerifyServerCertificate() {
        return sslVerifyServerCertificate;
    }

    public void setSslVerifyServerCertificate(String sslVerifyServerCertificate) {
        this.sslVerifyServerCertificate = sslVerifyServerCertificate;
    }

    public String getSslCrlFile() {
        return sslCrlFile;
    }

    public void setSslCrlFile(String sslCrlFile) {
        this.sslCrlFile = sslCrlFile;
    }

    public String getSslCrlPath() {
        return sslCrlPath;
    }

    public void setSslCrlPath(String sslCrlPath) {
        this.sslCrlPath = sslCrlPath;
    }

    public Integer getConnectionRetryInterval() {
        return connectionRetryInterval;
    }

    public void setConnectionRetryInterval(Integer connectionRetryInterval) {
        this.connectionRetryInterval = connectionRetryInterval;
    }

    public Long getConnectionRetryCount() {
        return connectionRetryCount;
    }

    public void setConnectionRetryCount(Long connectionRetryCount) {
        this.connectionRetryCount = connectionRetryCount;
    }

    public Double getHeartbeatInterval() {
        return heartbeatInterval;
    }

    public void setHeartbeatInterval(Double heartbeatInterval) {
        this.heartbeatInterval = heartbeatInterval;
    }

    public String getTlsVersion() {
        return tlsVersion;
    }

    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }
}