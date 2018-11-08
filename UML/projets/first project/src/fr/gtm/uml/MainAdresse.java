package fr.gtm.uml;

public class MainAdresse {

	public static void main(String[] args) {
		Adresse a1 = new Adresse();
		a1.setCodePostal("75001");
		a1.setRue("Rue de Rouen");
		a1.setVille("Paris");
		
		
		System.out.println(a1.getRue()+", "+a1.getCodePostal()+" - "+a1.getVille());

	}

}
