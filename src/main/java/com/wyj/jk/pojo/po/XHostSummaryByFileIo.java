package com.wyj.jk.pojo.po;

import java.math.BigDecimal;

public class XHostSummaryByFileIo {
    private String host;

    private BigDecimal ios;

    private BigDecimal ioLatency;

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

    public BigDecimal getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(BigDecimal ioLatency) {
        this.ioLatency = ioLatency;
    }
}