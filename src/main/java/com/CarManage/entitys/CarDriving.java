package com.CarManage.entitys;

import java.util.Date;

public class CarDriving {
    private Integer id;

    private String scnum;

    private String registrant;

    private String registrantid;

    private Date registerdate;

    private String applyid;

    private String applynum;

    private Date applydate;

    private String applicant;

    private String applicantid;

    private String carnumber;

    private String driver;

    private String driverid;

    private String ucman;

    private String ucmantel;

    private String drivemyself;

    private Date ridedate;

    private Date backdate;

    private Integer timersstart;

    private Integer timersend;

    private String isdisp;

    private String returndetail;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScnum() {
        return scnum;
    }

    public void setScnum(String scnum) {
        this.scnum = scnum == null ? null : scnum.trim();
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant == null ? null : registrant.trim();
    }

    public String getRegistrantid() {
        return registrantid;
    }

    public void setRegistrantid(String registrantid) {
        this.registrantid = registrantid == null ? null : registrantid.trim();
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getApplyid() {
        return applyid;
    }

    public void setApplyid(String applyid) {
        this.applyid = applyid == null ? null : applyid.trim();
    }

    public String getApplynum() {
        return applynum;
    }

    public void setApplynum(String applynum) {
        this.applynum = applynum == null ? null : applynum.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getApplicantid() {
        return applicantid;
    }

    public void setApplicantid(String applicantid) {
        this.applicantid = applicantid == null ? null : applicantid.trim();
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid == null ? null : driverid.trim();
    }

    public String getUcman() {
        return ucman;
    }

    public void setUcman(String ucman) {
        this.ucman = ucman == null ? null : ucman.trim();
    }

    public String getUcmantel() {
        return ucmantel;
    }

    public void setUcmantel(String ucmantel) {
        this.ucmantel = ucmantel == null ? null : ucmantel.trim();
    }

    public String getDrivemyself() {
        return drivemyself;
    }

    public void setDrivemyself(String drivemyself) {
        this.drivemyself = drivemyself == null ? null : drivemyself.trim();
    }

    public Date getRidedate() {
        return ridedate;
    }

    public void setRidedate(Date ridedate) {
        this.ridedate = ridedate;
    }

    public Date getBackdate() {
        return backdate;
    }

    public void setBackdate(Date backdate) {
        this.backdate = backdate;
    }

    public Integer getTimersstart() {
        return timersstart;
    }

    public void setTimersstart(Integer timersstart) {
        this.timersstart = timersstart;
    }

    public Integer getTimersend() {
        return timersend;
    }

    public void setTimersend(Integer timersend) {
        this.timersend = timersend;
    }

    public String getIsdisp() {
        return isdisp;
    }

    public void setIsdisp(String isdisp) {
        this.isdisp = isdisp == null ? null : isdisp.trim();
    }

    public String getReturndetail() {
        return returndetail;
    }

    public void setReturndetail(String returndetail) {
        this.returndetail = returndetail == null ? null : returndetail.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}