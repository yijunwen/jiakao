package com.wyj.jk.pojo.po;

import java.math.BigDecimal;

public class UserSummaryByFileIo {
    private String user;

    private BigDecimal ios;

    private String ioLatency;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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