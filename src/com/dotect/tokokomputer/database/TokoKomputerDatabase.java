/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotect.tokokomputer.database;

import com.dotect.tokokomputer.entity.Pelanggan;
import com.dotect.tokokomputer.impl.ProdukDaoImpl;
import com.dotect.tokokomputer.service.ProdukDao;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author YOGA
 */
public class TokoKomputerDatabase {
    private static Connection connection;
    private static ProdukDao produkDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null) {
             MysqlDataSource dataSource = new MysqlDataSource();
             dataSource.setURL("jdbc:mysql://localhost:3306/toko_komputer");
             dataSource.setUser("root");
             dataSource.setPassword("");
             connection = dataSource.getConnection();
        }
        
        return connection;
    }
    
    public static ProdukDao getProdukDao() throws SQLException{
        if (produkDao == null) {
            produkDao = new ProdukDaoImpl(getConnection());
        }
        return produkDao;
    }
}
