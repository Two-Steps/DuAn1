package com.example.duan1nhom2.Model;

import java.util.Date;

public class KhoanThu {
    private int idthu;
    private String namethu;
    private float sotien;
    private Date ngaythu;

    public KhoanThu() {
    }

    public int getIdthu() {
        return idthu;
    }

    public void setIdthu(int idthu) {
        this.idthu = idthu;
    }

    public String getNamethu() {
        return namethu;
    }

    public void setNamethu(String namethu) {
        this.namethu = namethu;
    }

    public float getSotien() {
        return sotien;
    }

    public void setSotien(float sotien) {
        this.sotien = sotien;
    }

    public Date getNgaythu() {
        return ngaythu;
    }

    public void setNgaythu(Date ngaythu) {
        this.ngaythu = ngaythu;
    }
}
