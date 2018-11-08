/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet5;

import java.util.List;
import metier.Client;

/**
 *
 * @author adminl
 */
public class Projet5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* ------- INSERT --------*/
        // Initialiser client
        Client client = new Client();
//        client.setIdclient(14);
        client.setRaisonsociale("GTM");
        client.setAdresse("12 villa lourcine");
        client.setVille("Paris");
        //Inserer en base
        dao.DaoClient.insert(client);
         

       
        /* ------- SELECT ALL NAME --------*/                
       List<Client> listeClient ;
        listeClient = dao.DaoClient.selectAllNames();
        for (Client listeClient1 : listeClient) {
            System.out.println(listeClient1.getRaisonsociale());
        }
        
    }
}
