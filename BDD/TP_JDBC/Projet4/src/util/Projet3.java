/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Bdd;

/**
 *
 * @author adminl
 */
public class Projet3 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args)  {
            
        try {
            Connection cnx = Bdd.seConnecter();
            
            String sql = "update article set prixunit = ? where idarticle = ?";
            PreparedStatement pstat = cnx.prepareStatement(sql);
            
            pstat.setDouble(1, 999.99);
            pstat.setInt(2,1);
            pstat.executeUpdate();
            
            
            Bdd.seDeconnecter(cnx);
        } catch (SQLException ex) {
            Logger.getLogger(Projet3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
