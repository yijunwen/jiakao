package com.wyj.jk.pojo.po;

import java.util.Date;

public class JsSysMsgInnerRecord {
    private String id;

    private String msgInnerId;

    private String receiveUserCode;

    private String receiveUserName;

    private String readStatus;

    private Date readDate;

    private String isStar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsgInnerId() {
        return msgInnerId;
    }

    public void setMsgInnerId(String msgInnerId) {
        this.msgInnerId = msgInnerId;
    }

    public String getReceiveUserCode() {
        return receiveUserCode;
    }

    public void setReceiveUserCode(String receiveUserCode) {
        this.receiveUserCode = receiveUserCode;
    }

    public String getReceiveUserName() {
        return receiveUserName;
    }

    public void setReceiveUserName(String receiveUserName) {
        this.receiveUserName = receiveUserName;
    }

    public String getReadStatus() {
        return readStatus;
    }

    public void setReadStatus(String readStatus) {
        this.readStatus = readStatus;
    }

    public Date getReadDate() {
        return readDate;
    }

    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }

    public String getIsStar() {
        return isStar;
    }

    public void setIsStar(String isStar) {
        this.isStar = isStar;
    }
}