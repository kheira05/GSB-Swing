/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Colin
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    //Pour connecter mariadb et la base lardon
    private static Connection cnxbdd = null;
    //Pour exécuter des requêtes
    private static Statement smt =null;
    
    /**
     * 
     * @throws SQLException 
     */
    public DAO() throws SQLException{
        cnxbdd = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/gsbvisite?useUnicode=true&amp;characterEncoding=utf8", 
                "root", 
                "1234");


        smt = cnxbdd.createStatement();
    }
   
    /**
     * 
     * @return 
     */
    public static Connection getConnection(){
        return cnxbdd;
    }

    /**
     * 
     * @return 
     */
    public static Statement getStatement() {
        return smt;
    }
}
