package com.CarManage.entitys;

import java.util.Date;

public class CarCarinfo {
    private Integer id;

    private String carnum;

    private String carbrand;

    private String cartype;

    private Byte usestatus;

    private String fluetype;

    private String enginenum;

    private Integer seatnum;

    private String purpose;

    private String belongdept;

    private Integer purchaseprice;

    private Float displacement;

    private Byte carstatus;

    private Date purchasedate;

    private String photo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum == null ? null : carnum.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Byte getUsestatus() {
        return usestatus;
    }

    public void setUsestatus(Byte usestatus) {
        this.usestatus = usestatus;
    }

    public String getFluetype() {
        return fluetype;
    }

    public void setFluetype(String fluetype) {
        this.fluetype = fluetype == null ? null : fluetype.trim();
    }

    public String getEnginenum() {
        return enginenum;
    }

    public void setEnginenum(String enginenum) {
        this.enginenum = enginenum == null ? null : enginenum.trim();
    }

    public Integer getSeatnum() {
        return seatnum;
    }

    public void setSeatnum(Integer seatnum) {
        this.seatnum = seatnum;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getBelongdept() {
        return belongdept;
    }

    public void setBelongdept(String belongdept) {
        this.belongdept = belongdept == null ? null : belongdept.trim();
    }

    public Integer getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(Integer purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Float displacement) {
        this.displacement = displacement;
    }

    public Byte getCarstatus() {
        return carstatus;
    }

    public void setCarstatus(Byte carstatus) {
        this.carstatus = carstatus;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}