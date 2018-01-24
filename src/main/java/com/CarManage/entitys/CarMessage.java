package com.CarManage.entitys;

import java.util.Date;

public class CarMessage {
    private Integer id;

    private String fromid;

    private String fromname;

    private String toid;

    private String toname;

    private String content;

    private Byte status;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFromid() {
        return fromid;
    }

    public void setFromid(String fromid) {
        this.fromid = fromid == null ? null : fromid.trim();
    }

    public String getFromname() {
        return fromname;
    }

    public void setFromname(String fromname) {
        this.fromname = fromname == null ? null : fromname.trim();
    }

    public String getToid() {
        return toid;
    }

    public void setToid(String toid) {
        this.toid = toid == null ? null : toid.trim();
    }

    public String getToname() {
        return toname;
    }

    public void setToname(String toname) {
        this.toname = toname == null ? null : toname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}