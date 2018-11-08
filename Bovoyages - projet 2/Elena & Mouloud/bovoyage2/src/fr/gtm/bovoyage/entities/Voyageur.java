package fr.gtm.bovoyage.entities;

import java.util.Date;

/**
 * Classe modélisant un participant à un voyage
 * @author franck
 *
 */
public class Voyageur {
	private long id;
	private String civilite;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	public Voyageur() {}
	
	public Voyageur(String civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Voyageur(String civilite, String nom, String prenom, Date dateNaissance) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
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
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	

}
