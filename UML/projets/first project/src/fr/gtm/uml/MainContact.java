package fr.gtm.uml;

public class MainContact {
	// ceci est un commentaire sur une ligne
	public static void main(String[] args) {
		/*
		 * commentaires sur 
		 * plusieurs lignes
		 */
		
		// instanciation d'un Contact et initialisation de ses propriétés
		Contact contact = new Contact();
		contact.setNom("LAGAFFE");
		contact.setPrenom("Gaston");
		contact.setTelephone("0101010101");
		
		// instanciation d'une Adresse et initialisation de ses propriétés
		Adresse adresse = new Adresse();
		adresse.setCodePostal("75001");
		adresse.setRue("Rue de Rouen");
		adresse.setVille("Paris");
		
		// association entre adresse et contact
		contact.setAdresse(adresse);
		adresse.setContact(contact);
		
		System.out.println(contact.getPrenom()+" habite à "+contact.getAdresse().getVille());
		System.out.println(adresse.getContact().getNom());
	}
}
