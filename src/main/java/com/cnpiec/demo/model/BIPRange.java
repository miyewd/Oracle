package com.cnpiec.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BIPRange {
    private String id;

    /**
     * 机构ID
     */
    private String insId;

    /**
     * 开始IP
     */
    private String startIp;

    /**
     * 结束IP
     */
    private String endIp;

    /**
     * 长整型开始IP
     */
    private long startLIp;

    /**
     * 长整型结束IP
     */
    private long startEIp;

    public BIPRange() {
        super();
    }

    public BIPRange(String id, String insId, String startIp, String endIp, long startLIp, long startEIp,
            Date ipCreatetime, String bipName) {
        super();
        this.id = id;
        this.insId = insId;
        this.startIp = startIp;
        this.endIp = endIp;
        this.startLIp = startLIp;
        this.startEIp = startEIp;
        this.ipCreatetime = ipCreatetime;
        this.bipName = bipName;
    }

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ipCreatetime;
    /**
     * 机构名称
     */
    private String bipName;

    public String getBipName() {
        return bipName;
    }

    public void setBipName(String bipName) {
        this.bipName = bipName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInsId() {
        return insId;
    }

    public void setInsId(String insId) {
        this.insId = insId;
    }

    public String getStartIp() {
        return startIp;
    }

    public void setStartIp(String startIp) {
        this.startIp = startIp;
    }

    public String getEndIp() {
        return endIp;
    }

    public void setEndIp(String endIp) {
        this.endIp = endIp;
    }

    public long getStartLIp() {
        return startLIp;
    }

    public void setStartLIp(long startLIp) {
        this.startLIp = startLIp;
    }

    public long getStartEIp() {
        return startEIp;
    }

    public void setStartEIp(long startEIp) {
        this.startEIp = startEIp;
    }

    public Date getIpCreatetime() {
        return ipCreatetime;
    }

    public void setIpCreatetime(Date ipCreatetime) {
        this.ipCreatetime = ipCreatetime;
    }

}