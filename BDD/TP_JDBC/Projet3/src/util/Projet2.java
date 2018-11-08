/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Bdd;

/**
 *
 * @author adminl
 */
public class Projet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection cnx = Bdd.seConnecter();
            String sql = "insert into client values (9,'GTM','2 rue Stephenson','78180','Montigny','0161084820', null)";
            Statement stat = cnx.createStatement();
            stat.executeUpdate(sql);
            System.out.println("une ligne inserée");
            Bdd.seDeconnecter(cnx);
        } catch (SQLException ex) {
            Logger.getLogger(Projet2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
