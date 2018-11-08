package fr.gtm.poo;

public class VeloEnfant extends Bicycle {
	public void pousser() {
		System.out.println("on pousse l'enfant sur le vélo");
	}
	
	@Override
	public void accelerer(int vitesseMax) {
		if(vitesseMax>5) {
			System.out.println("Un enfant ne pédale pas assez vite");
		}
		// appel la méthode accelerer de Bicycle (la classe mère)
		// l'appel d'une méthode de la classe mère n'est pas obligatoire
		super.accelerer(5);
	}

}
