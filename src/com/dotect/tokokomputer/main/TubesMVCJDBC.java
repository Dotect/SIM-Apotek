/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotect.tokokomputer.main;

import com.dotect.tokokomputer.database.TokoKomputerDatabase;
import java.sql.SQLException;

/**
 *
 * @author Anonymous
 */
public class TubesMVCJDBC {
    public static void main(String[] args) throws SQLException{
        TokoKomputerDatabase.getConnection();
    }
}
