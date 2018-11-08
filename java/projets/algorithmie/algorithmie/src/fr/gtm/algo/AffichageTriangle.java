package fr.gtm.algo;

public class AffichageTriangle {
	public static void main(String[] args) {
		int nbLignes = 15;
		afficherPyramide(nbLignes);
	}

	private static void afficherPyramide(int nbLignes) {
		StringBuffer buffer = new StringBuffer();
		int nbEspaces = 0;
		int nbSymboles = 0;
		for (int i = 0; i < nbLignes; i++) {
			nbEspaces = nbLignes - 1 - i;
			nbSymboles = (i * 2) + 1;
			for (int j = 0; j < nbEspaces; j++) {
				buffer.append(" ");
			}
			for (int j = 0; j < nbSymboles; j++) {
				buffer.append("*");
			}
			buffer.append('\n');
		}
		System.out.println(buffer.toString());
	}
}
