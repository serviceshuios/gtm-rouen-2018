package fr.gtm.feu;

public class Voiture extends Vehicule {

	
	public Voiture(String marque) {
		super(marque);
		System.out.println("Constructeur : public Voiture(String marque)");
	}

	@Override
	public void demarrer() {
		System.out.format("La voiture %s démarre\n",this.getMarque());
	}

}
