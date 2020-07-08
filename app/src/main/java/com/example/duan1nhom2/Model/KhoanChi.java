package com.example.duan1nhom2.Model;

import java.util.Date;

public class KhoanChi {
    private int idchi;
    private String namechi;
    private float sotienchi;
    private Date ngaychi;

    public KhoanChi() {
    }

    public KhoanChi(int idchi, String namechi, float sotienchi, Date ngaychi) {
        this.idchi = idchi;
        this.namechi = namechi;
        this.sotienchi = sotienchi;
        this.ngaychi = ngaychi;
    }

    public int getIdchi() {
        return idchi;
    }

    public void setIdchi(int idchi) {
        this.idchi = idchi;
    }

    public String getNamechi() {
        return namechi;
    }

    public void setNamechi(String namechi) {
        this.namechi = namechi;
    }

    public float getSotienchi() {
        return sotienchi;
    }

    public void setSotienchi(float sotienchi) {
        this.sotienchi = sotienchi;
    }

    public Date getNgaychi() {
        return ngaychi;
    }

    public void setNgaychi(Date ngaychi) {
        this.ngaychi = ngaychi;
    }
}