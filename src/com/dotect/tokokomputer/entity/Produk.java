/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotect.tokokomputer.entity;

import java.util.Objects;

/**
 *
 * @author Anonymous
 */
public class Produk {
    private int id_produk;
    private String nama_produk;
    private int harga;
    private int stok;
    private int berat;
    private String deskripsi;
    private int id_kategori;

    public Produk(int id_produk, String nama_produk, int harga, int stok, int berat, String deskripsi, int id_kategori) {
        this.id_produk = id_produk;
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.stok = stok;
        this.berat = berat;
        this.deskripsi = deskripsi;
        this.id_kategori = id_kategori;
    }

    public int getId_produk() {
        return id_produk;
    }

    public void setId_produk(int id_produk) {
        this.id_produk = id_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.id_produk;
        hash = 61 * hash + Objects.hashCode(this.nama_produk);
        hash = 61 * hash + this.harga;
        hash = 61 * hash + this.stok;
        hash = 61 * hash + this.berat;
        hash = 61 * hash + Objects.hashCode(this.deskripsi);
        hash = 61 * hash + this.id_kategori;
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
        final Produk other = (Produk) obj;
        if (this.id_produk != other.id_produk) {
            return false;
        }
        if (this.harga != other.harga) {
            return false;
        }
        if (this.stok != other.stok) {
            return false;
        }
        if (this.berat != other.berat) {
            return false;
        }
        if (this.id_kategori != other.id_kategori) {
            return false;
        }
        if (!Objects.equals(this.nama_produk, other.nama_produk)) {
            return false;
        }
        if (!Objects.equals(this.deskripsi, other.deskripsi)) {
            return false;
        }
        return true;
    }
    
    
}
