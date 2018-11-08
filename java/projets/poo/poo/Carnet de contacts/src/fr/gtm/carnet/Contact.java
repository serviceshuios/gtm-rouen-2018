package fr.gtm.carnet;

public class Contact {
	private String civilite;
	private String nom;
	private String prenom;
	private Adresse adresse;
	public Contact(String civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Contact(String civilite, String nom, String prenom, Adresse adresse) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
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
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return String.format("%s %s %s (%s, %s)",civilite,nom,prenom,adresse.getRue(),adresse.getVille());
	}
	
}