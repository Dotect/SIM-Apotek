/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotect.tokokomputer.impl;

import com.dotect.tokokomputer.entity.Produk;
import com.dotect.tokokomputer.error.ProdukException;
import com.dotect.tokokomputer.service.ProdukDao;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public class ProdukDaoImpl implements ProdukDao{

    private Connection connection;
    private final String insertProduk = "INSERT INTO pelanggan (email_pelanggan,password_pelanggan,nama_pelanggan,telepon)"
            + "VALUES (?,?,?,?)";
            

    public ProdukDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    
    
    @Override
    public void insertProduk(Produk produk) throws ProdukException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateProduk(Produk produk) throws ProdukException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProduk(Integer id) throws ProdukException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getProduk(Integer id) throws ProdukException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getProduk(String nama) throws ProdukException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produk> SelectAllProduk() throws ProdukException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
