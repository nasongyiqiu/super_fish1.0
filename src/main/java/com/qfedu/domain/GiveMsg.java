package com.qfedu.domain;

public class GiveMsg {
    private Integer id;

    private Integer uid;

    private Integer doodid;

    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getDoodid() {
        return doodid;
    }

    public void setDoodid(Integer doodid) {
        this.doodid = doodid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}