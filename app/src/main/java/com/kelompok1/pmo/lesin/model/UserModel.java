package com.kelompok1.pmo.lesin.model;

import java.util.Date;

public class UserModel {
    private String nama;
    private String email;
    private String password;
    private String nohp;
    private String alamat;
    private Date lastLogin;

    public UserModel(String nama,String email,String password){
        this.setNama(nama);
        this.setEmail(email);
        this.setPassword(password);
    }

    public UserModel(String nama, String email,String password,String alamat,String nohp){
        this.setNama(nama);
        this.setEmail(email);
        this.setPassword(password);
        this.setAlamat(alamat);
        this.setNohp(nohp);
    }

    public UserModel(String nama,String email){
        this.setNama(nama);
        this.setEmail(email);
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
