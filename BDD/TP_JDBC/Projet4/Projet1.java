/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author adminl
 */
public class Projet1 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws  SQLException     {
                          
        try { 
            Connection cnx;
            Class.forName("oracle.jdbc.OracleDriver");
            cnx = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "toto", "toto");
            String sql = "insert into client values (8,'GTM','2 rue Stephenson','78180','Montigny','0161084820', null)";
            Statement stat;
            stat = cnx.createStatement();
            stat.executeUpdate(sql);
            System.out.println("une ligne inserée");  
            cnx.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Impossible de créer cnx");
            Logger.getLogger(Projet1.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
