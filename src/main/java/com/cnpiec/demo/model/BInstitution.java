package com.cnpiec.demo.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BInstitution {
    /**
     * 机构ID
     */
    private String id;

    /**
     * null
     */
    private String accessaccount;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 地址1
     */
    private String address1;

    /**
     * 地址2
     */
    private String address2;

    /**
     * 地址3
     */
    private String address3;

    /**
     * 地址4
     */
    private String address4;

    /**
     * 地址5
     */
    private String address5;

    /**
     * 地区
     */
    private String state;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 国家
     */
    private String country;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createddate;

    /**
     * Cust-type
     */
    private String custtype;

    /**
     * Dest-type
     */
    private String desttype;

    /**
     * 订阅类型
     */
    private String subscribertype;

    /**
     * Email
     */
    private String email;

    /**
     * 备注
     */
    private String memo;

    /**
     * 机构LOGO图片路径
     */
    private String logoPath;

    /**
     * 机构链接
     */
    private String url;

    /**
     * 机构简称
     */
    private String abbreviation;

    /**
     * IP信息
     */
    private String ipCredentials;
    /**
     * 全站授权状态 0：否 1：是
     */
    private Integer oaStatus;

    /**
     * 来源文件ID
     */
    private String fileId;

    /**
     * 任务ID
     */
    private String taskId;

    /**
     * 授权全部开发/禁止的状态， 中图控制，主要用于恶意访问0-禁止，1-开启（默认值）,2-临时禁止
     */
    private Integer cnpStatus;

    /**
     * IP地址集合
     * 
     * @return
     */
    private List<BIPRange> bipRanges;

    private String ringgoldId;

    public Integer getCnpStatus() {
        return cnpStatus;
    }

    public void setCnpStatus(Integer cnpStatus) {
        this.cnpStatus = cnpStatus;
    }

    /**
     * 机构ID
     * 
     * @return ID 机构ID
     */
    public String getId() {
        return id;
    }

    /**
     * 机构ID
     * 
     * @param id
     *            机构ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * null
     * 
     * @return ACCESSACCOUNT null
     */
    public String getAccessaccount() {
        return accessaccount;
    }

    /**
     * null
     * 
     * @param accessaccount
     *            null
     */
    public void setAccessaccount(String accessaccount) {
        this.accessaccount = accessaccount == null ? null : accessaccount.trim();
    }

    /**
     * 机构名称
     * 
     * @return NAME 机构名称
     */
    public String getName() {
        return name;
    }

    /**
     * 机构名称
     * 
     * @param name
     *            机构名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 地址1
     * 
     * @return ADDRESS1 地址1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * 地址1
     * 
     * @param address1
     *            地址1
     */
    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    /**
     * 地址2
     * 
     * @return ADDRESS2 地址2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * 地址2
     * 
     * @param address2
     *            地址2
     */
    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    /**
     * 地址3
     * 
     * @return ADDRESS3 地址3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * 地址3
     * 
     * @param address3
     *            地址3
     */
    public void setAddress3(String address3) {
        this.address3 = address3 == null ? null : address3.trim();
    }

    /**
     * 地址4
     * 
     * @return ADDRESS4 地址4
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * 地址4
     * 
     * @param address4
     *            地址4
     */
    public void setAddress4(String address4) {
        this.address4 = address4 == null ? null : address4.trim();
    }

    /**
     * 地址5
     * 
     * @return ADDRESS5 地址5
     */
    public String getAddress5() {
        return address5;
    }

    /**
     * 地址5
     * 
     * @param address5
     *            地址5
     */
    public void setAddress5(String address5) {
        this.address5 = address5 == null ? null : address5.trim();
    }

    /**
     * 地区
     * 
     * @return STATE 地区
     */
    public String getState() {
        return state;
    }

    /**
     * 地区
     * 
     * @param state
     *            地区
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 邮编
     * 
     * @return POSTCODE 邮编
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 邮编
     * 
     * @param postcode
     *            邮编
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    /**
     * 国家
     * 
     * @return COUNTRY 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 国家
     * 
     * @param country
     *            国家
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 创建时间
     * 
     * @return CREATEDDATE 创建时间
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * 创建时间
     * 
     * @param createddate
     *            创建时间
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * Cust-type
     * 
     * @return CUSTTYPE Cust-type
     */
    public String getCusttype() {
        return custtype;
    }

    /**
     * Cust-type
     * 
     * @param custtype
     *            Cust-type
     */
    public void setCusttype(String custtype) {
        this.custtype = custtype == null ? null : custtype.trim();
    }

    /**
     * Dest-type
     * 
     * @return DESTTYPE Dest-type
     */
    public String getDesttype() {
        return desttype;
    }

    /**
     * Dest-type
     * 
     * @param desttype
     *            Dest-type
     */
    public void setDesttype(String desttype) {
        this.desttype = desttype == null ? null : desttype.trim();
    }

    /**
     * 订阅类型
     * 
     * @return SUBSCRIBERTYPE 订阅类型
     */
    public String getSubscribertype() {
        return subscribertype;
    }

    /**
     * 订阅类型
     * 
     * @param subscribertype
     *            订阅类型
     */
    public void setSubscribertype(String subscribertype) {
        this.subscribertype = subscribertype == null ? null : subscribertype.trim();
    }

    /**
     * Email
     * 
     * @return EMAIL Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Email
     * 
     * @param email
     *            Email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 备注
     * 
     * @return MEMO 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 备注
     * 
     * @param memo
     *            备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getIpCredentials() {
        return ipCredentials;
    }

    public void setIpCredentials(String ipCredentials) {
        this.ipCredentials = ipCredentials;
    }

    public Integer getOaStatus() {
        return oaStatus;
    }

    public void setOaStatus(Integer oaStatus) {
        this.oaStatus = oaStatus;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public List<BIPRange> getBipRanges() {
        return bipRanges;
    }

    public void setBipRanges(List<BIPRange> bipRanges) {
        this.bipRanges = bipRanges;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getRinggoldId() {
        return ringgoldId;
    }

    public void setRinggoldId(String ringgoldId) {
        this.ringgoldId = ringgoldId;
    }

}