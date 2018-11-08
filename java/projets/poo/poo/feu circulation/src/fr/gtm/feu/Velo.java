package fr.gtm.feu;

public class Velo extends Vehicule {
	public Velo(String marque) {
		super(marque);
		System.out.println("Constructeur : public Velo(String marque)");
	}

	@Override
	public void demarrer() {
		System.out.format("Le vélo %s démarre\n",getMarque());

	}


}
