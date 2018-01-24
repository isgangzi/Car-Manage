package com.CarManage.entitys;

import java.util.Date;

public class CarDriverinfo {
    private Integer id;

    private Integer userid;

    private String drivername;

    private String idcard;

    private String address;

    private String sex;

    private String telephone;

    private Date birthdate;

    private String licensetype;

    private String licensenumber;

    private Date licensegetdate;

    private String iffulltime;

    private String photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getLicensetype() {
        return licensetype;
    }

    public void setLicensetype(String licensetype) {
        this.licensetype = licensetype == null ? null : licensetype.trim();
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber == null ? null : licensenumber.trim();
    }

    public Date getLicensegetdate() {
        return licensegetdate;
    }

    public void setLicensegetdate(Date licensegetdate) {
        this.licensegetdate = licensegetdate;
    }

    public String getIffulltime() {
        return iffulltime;
    }

    public void setIffulltime(String iffulltime) {
        this.iffulltime = iffulltime == null ? null : iffulltime.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}