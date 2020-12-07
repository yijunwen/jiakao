package com.wyj.jk.pojo.po;

public class ThreadGroupStatus {
    private Integer id;

    private Integer threadCount;

    private Integer activeThreadCount;

    private Integer connectionCount;

    private Integer waitingThreadCount;

    private Long dumpCount;

    private Long lowQueueCount;

    private Long highQueueCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(Integer threadCount) {
        this.threadCount = threadCount;
    }

    public Integer getActiveThreadCount() {
        return activeThreadCount;
    }

    public void setActiveThreadCount(Integer activeThreadCount) {
        this.activeThreadCount = activeThreadCount;
    }

    public Integer getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    public Integer getWaitingThreadCount() {
        return waitingThreadCount;
    }

    public void setWaitingThreadCount(Integer waitingThreadCount) {
        this.waitingThreadCount = waitingThreadCount;
    }

    public Long getDumpCount() {
        return dumpCount;
    }

    public void setDumpCount(Long dumpCount) {
        this.dumpCount = dumpCount;
    }

    public Long getLowQueueCount() {
        return lowQueueCount;
    }

    public void setLowQueueCount(Long lowQueueCount) {
        this.lowQueueCount = lowQueueCount;
    }

    public Long getHighQueueCount() {
        return highQueueCount;
    }

    public void setHighQueueCount(Long highQueueCount) {
        this.highQueueCount = highQueueCount;
    }
}