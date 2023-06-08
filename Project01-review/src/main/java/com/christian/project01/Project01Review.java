/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.christian.project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chris
 */
public class Project01Review {

    public static void main(String[] args) {
        Connection con=null;
        try {
            String url = "jdbc:postgresql://localhost:5432/ejemplo";
            String user = "postgres";
            String pwd = "admin";
            con= DriverManager.getConnection(url, user, pwd);
            Logger.getLogger(Project01Review.class.getName()).log(Level.INFO, "Se conectó..." );
        } catch (SQLException ex) {
            Logger.getLogger(Project01Review.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                if(con!=null)
                    con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Project01Review.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
