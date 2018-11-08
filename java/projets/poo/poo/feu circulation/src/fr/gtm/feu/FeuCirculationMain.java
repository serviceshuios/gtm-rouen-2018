package fr.gtm.feu;

public class FeuCirculationMain {

	public static void main(String[] args) {
		Vehicule voiture1 = new Voiture("Honda");

		Vehicule voiture2 = new Voiture("Suzuki");

		
		FeuCirculation feu = new FeuCirculation();
		feu.add(new Moto("BMW"));
		feu.add(new Velo("B'twin"));
		feu.add(voiture2);
		feu.add(voiture1);
		
		feu.passerAuVert();
		

	}

}
