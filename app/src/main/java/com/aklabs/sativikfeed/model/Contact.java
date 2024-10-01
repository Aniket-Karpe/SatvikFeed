package com.aklabs.sativikfeed.model;

public class Contact {
    public String cname,csubname;
    public  int cImg;

    public Contact(String cname, String csubname, int cImg) {
        this.cname = cname;
        this.csubname = csubname;
        this.cImg = cImg;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCsubname() {
        return csubname;
    }

    public void setCsubname(String csubname) {
        this.csubname = csubname;
    }

    public int getcImg() {
        return cImg;
    }

    public void setcImg(int cImg) {
        this.cImg = cImg;
    }
}
