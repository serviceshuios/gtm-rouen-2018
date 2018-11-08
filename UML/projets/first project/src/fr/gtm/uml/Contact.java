package fr.gtm.uml;

public class Contact {
	private String civilite;
	private String nom;
	private String prenom;
	private String telephone;
	private Adresse adresse;

	public String getCivilite() {
		return civilite;
	}

	// this => instance en cours d'utilisation
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

//	// visibilité type_de_retour nom_méthode(liste des paramètres){
//	//		corps de la méthode => code qui sera exécuté
//	//}
//	public String getNom() {
//		return nom;
//	}
//	
//	
//	// void => pas de retour de valeur
//	public void setNom(String name) {
//		nom=name;
//	}
}
