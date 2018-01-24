package com.CarManage.entitys;

import java.util.Date;

public class CarApply {
    private Integer id;

    private String applynum;

    private Date applydate;

    private String applicant;

    private String applicantid;

    private String carnumber;

    private String driver;

    private String driverid;

    private String departureplace;

    private String targetplace;

    private String drirouteexplain;

    private Date usebegindate;

    private Date useoverdate;

    private String usereason;

    private String ucman;

    private String ucmantel;

    private String drivemyself;

    private String isdisp;

    private String remark;

    private String backreason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDepartureplace() {
        return departureplace;
    }

    public void setDepartureplace(String departureplace) {
        this.departureplace = departureplace == null ? null : departureplace.trim();
    }

    public String getTargetplace() {
        return targetplace;
    }

    public void setTargetplace(String targetplace) {
        this.targetplace = targetplace == null ? null : targetplace.trim();
    }

    public String getDrirouteexplain() {
        return drirouteexplain;
    }

    public void setDrirouteexplain(String drirouteexplain) {
        this.drirouteexplain = drirouteexplain == null ? null : drirouteexplain.trim();
    }

    public Date getUsebegindate() {
        return usebegindate;
    }

    public void setUsebegindate(Date usebegindate) {
        this.usebegindate = usebegindate;
    }

    public Date getUseoverdate() {
        return useoverdate;
    }

    public void setUseoverdate(Date useoverdate) {
        this.useoverdate = useoverdate;
    }

    public String getUsereason() {
        return usereason;
    }

    public void setUsereason(String usereason) {
        this.usereason = usereason == null ? null : usereason.trim();
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

    public String getIsdisp() {
        return isdisp;
    }

    public void setIsdisp(String isdisp) {
        this.isdisp = isdisp == null ? null : isdisp.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBackreason() {
        return backreason;
    }

    public void setBackreason(String backreason) {
        this.backreason = backreason == null ? null : backreason.trim();
    }
}