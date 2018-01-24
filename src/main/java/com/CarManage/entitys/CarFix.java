package com.CarManage.entitys;

import java.util.Date;

public class CarFix {
    private Integer id;

    private String registrantid;

    private String registrant;

    private Date registtime;

    private String carnum;

    private Byte fixtype;

    private Integer total;

    private Date fixtime;

    private String fixsite;

    private String fixcorp;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegistrantid() {
        return registrantid;
    }

    public void setRegistrantid(String registrantid) {
        this.registrantid = registrantid == null ? null : registrantid.trim();
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant == null ? null : registrant.trim();
    }

    public Date getRegisttime() {
        return registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum == null ? null : carnum.trim();
    }

    public Byte getFixtype() {
        return fixtype;
    }

    public void setFixtype(Byte fixtype) {
        this.fixtype = fixtype;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getFixtime() {
        return fixtime;
    }

    public void setFixtime(Date fixtime) {
        this.fixtime = fixtime;
    }

    public String getFixsite() {
        return fixsite;
    }

    public void setFixsite(String fixsite) {
        this.fixsite = fixsite == null ? null : fixsite.trim();
    }

    public String getFixcorp() {
        return fixcorp;
    }

    public void setFixcorp(String fixcorp) {
        this.fixcorp = fixcorp == null ? null : fixcorp.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}