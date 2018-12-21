/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotect.tokokomputer.entity;

import java.util.Objects;

/**
 *
 * @author YOGA
 */
public class Pelanggan {
    private Integer id_pelanggan;
    private String email_pelanggan;
    private String password;
    private String nama_pelanggan;
    private String telepon;

    public Pelanggan(Integer id_pelanggan, String email_pelanggan, String password, String nama_pelanggan, String telepon) {
        this.id_pelanggan = id_pelanggan;
        this.email_pelanggan = email_pelanggan;
        this.password = password;
        this.nama_pelanggan = nama_pelanggan;
        this.telepon = telepon;
    }

    public Integer getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(Integer id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getEmail_pelanggan() {
        return email_pelanggan;
    }

    public void setEmail_pelanggan(String email_pelanggan) {
        this.email_pelanggan = email_pelanggan;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id_pelanggan);
        hash = 89 * hash + Objects.hashCode(this.email_pelanggan);
        hash = 89 * hash + Objects.hashCode(this.password);
        hash = 89 * hash + Objects.hashCode(this.nama_pelanggan);
        hash = 89 * hash + Objects.hashCode(this.telepon);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelanggan other = (Pelanggan) obj;
        if (!Objects.equals(this.email_pelanggan, other.email_pelanggan)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.nama_pelanggan, other.nama_pelanggan)) {
            return false;
        }
        if (!Objects.equals(this.telepon, other.telepon)) {
            return false;
        }
        if (!Objects.equals(this.id_pelanggan, other.id_pelanggan)) {
            return false;
        }
        return true;
    }
    
    
}
