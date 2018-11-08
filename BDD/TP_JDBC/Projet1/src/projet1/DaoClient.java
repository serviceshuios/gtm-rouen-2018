/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Client;
import util.Bdd;

/**
 *
 * @author adminl
 */
public class DaoClient {  
    public static void insert(Client client) {        
        try {
            Connection cnx = Bdd.seConnecter();
            //create sequence seq_cli start with 8;
            String sql = "insert into client values (seq_cli.nextval,?,?,?,?,?, null)";
            java.sql.PreparedStatement stat = cnx.prepareStatement(sql);
            
            // renseinger parametres 
            //stat.setInt(1, client.getIdclient());
            stat.setString(1, client.getRaisonsociale());
            stat.setString(2, client.getAdresse());
            stat.setString(3, client.getCodepostal());
            stat.setString(4, client.getVille());
            stat.setString(5, client.getTelephone());
            
            //executer SQL
            stat.executeUpdate();
            System.out.println("Une ligne inserée.");
            Bdd.seDeconnecter(cnx);
        } catch (SQLException ex) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      
 
    public static List<Client> selectAllNames() {
        List<Client> listeClient = new ArrayList<>();
        try {

            Connection cnx = Bdd.seConnecter();
            String sql = "SELECT raisonsociale FROM client order by 1";
            Statement stat = cnx.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                Client client = new Client(res.getString(1));
                listeClient.add(client);
            }

            Bdd.seDeconnecter(cnx);

        } catch (SQLException ex) {
            Logger.getLogger(DaoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listeClient;
            
        }
    
}
