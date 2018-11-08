package fr.gtm.bovoyage.entities;

/**
 * Classe modélisant un client<br>
 * Le voyage est payé par le client<br>
 * Le client peut-être une personne ou un organisme.
 * @author franck
 *
 */
public class Client {
	private long id;
	private String nom;
	
	public Client() {}
	
	public Client(String nom) {
		this.nom = nom;
	}
	/**
	 * ID de synchronisation avec la clé primaire
	 * @return
	 */
	public long getId() {
		return id;
	}
	/**
	 * ID de synchronisation avec la clé primaire
	 * <h3>Ne doit pas être mis à jour en dehors du DAO</h3>
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
