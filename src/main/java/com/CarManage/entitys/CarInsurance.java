package com.CarManage.entitys;

import java.util.Date;

public class CarInsurance {
    private Integer id;

    private String registrantid;

    private String registrant;

    private Date registtime;

    private String carnum;

    private String insureno;

    private String insurecorp;

    private String handler;

    private Integer insureprice;

    private Date startdate;

    private Date enddate;

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

    public String getInsureno() {
        return insureno;
    }

    public void setInsureno(String insureno) {
        this.insureno = insureno == null ? null : insureno.trim();
    }

    public String getInsurecorp() {
        return insurecorp;
    }

    public void setInsurecorp(String insurecorp) {
        this.insurecorp = insurecorp == null ? null : insurecorp.trim();
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public Integer getInsureprice() {
        return insureprice;
    }

    public void setInsureprice(Integer insureprice) {
        this.insureprice = insureprice;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}