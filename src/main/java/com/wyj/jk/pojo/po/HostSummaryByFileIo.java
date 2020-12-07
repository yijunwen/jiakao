package com.wyj.jk.pojo.po;

import java.math.BigDecimal;

public class HostSummaryByFileIo {
    private String host;

    private BigDecimal ios;

    private String ioLatency;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public BigDecimal getIos() {
        return ios;
    }

    public void setIos(BigDecimal ios) {
        this.ios = ios;
    }

    public String getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(String ioLatency) {
        this.ioLatency = ioLatency;
    }
}