package fr.gtm.mammifere;

public abstract class Mammifere {
	private String couleur;
	
	/**
	 * 
	 */
	public abstract void crier();

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
