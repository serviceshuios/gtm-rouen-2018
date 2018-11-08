package fr.gtm.feu;

public abstract class Vehicule {
	private String marque;
	
	// Constructeur avec un paramètre de type String
	public Vehicule(String marque) {
		System.out.println("Constructeur : public Vehicule(String marque)");
		this.marque = marque;
	}
	
	
	public abstract void demarrer();


	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
}
