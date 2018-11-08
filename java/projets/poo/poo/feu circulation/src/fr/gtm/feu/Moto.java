package fr.gtm.feu;

public class Moto extends Vehicule {
	public Moto(String marque) {
		super(marque);
		System.out.println("Constructeur : public Moto(String marque)");
	}

	@Override
	public void demarrer() {
		System.out.format("La moto %s démarre\n",this.getMarque());

	}


}
