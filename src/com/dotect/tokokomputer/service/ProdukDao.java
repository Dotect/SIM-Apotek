/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotect.tokokomputer.service;

import com.dotect.tokokomputer.entity.Produk;
import com.dotect.tokokomputer.error.ProdukException;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public interface ProdukDao {
    
    public void insertProduk(Produk produk) throws ProdukException;
    public void updateProduk(Produk produk) throws ProdukException;
    public void deleteProduk(Integer id) throws ProdukException;
    public void getProduk(Integer id) throws ProdukException;
    public void getProduk(String nama) throws ProdukException;
    public List<Produk> SelectAllProduk() throws ProdukException;
    
}
