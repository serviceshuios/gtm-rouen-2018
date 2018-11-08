/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet4;

import util.Bdd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adminl
 */
public class Projet4 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args)  {
        try {
            // TODO code application logic here
            
            Connection cnx = Bdd.seConnecter();
            String affichage = "Select raisonsociale, co.numcom numero_de_commande, sum(lc.qtecom*art.prixunit) montant"+
                    " from client cl, commande co, ligne_com lc,article art"+
                    " where cl.idclient=co.idclient "+
                    "and co.numcom = lc.numcom "+
                    "and lc.idarticle = art.idarticle "+
                    "GROUP BY raisonsociale, co.numcom "+
                    "order by 3 desc";
            Statement pstmt = cnx.createStatement();
            ResultSet rs = pstmt.executeQuery(affichage);
            while (rs.next()) {
                String raisonsociale = rs.getString(1);
                int numerocommande = rs.getInt(2);
                double prixdelacommande = rs.getDouble(3);
                System.out.println("Le groupe "+raisonsociale+" a le numéro de commande "+numerocommande+" dont le montant est de "+prixdelacommande);
            }
            Bdd.seDeconnecter(cnx);
        } catch (SQLException ex) {
            Logger.getLogger(Projet4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
