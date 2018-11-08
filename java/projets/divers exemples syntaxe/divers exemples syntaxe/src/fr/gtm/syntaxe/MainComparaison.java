package fr.gtm.syntaxe;

public class MainComparaison {

	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		if(i == j) {
			System.out.println("i et j sont égaux");
		}else {
			System.out.println("i et j sont déférents");
		}
		
		Entier e1 = new Entier(1);
		Entier e2 = new Entier(1);
		if (e1 == e2) {
			System.out.println("e1 == e2");
		} else {
			System.out.println("e1 != e2");
		}
		
		if (e1.equals(e2)) {
			System.out.println("e1 et e2 sont égaux");
		} else {
			System.out.println("e1 et e2 ne sont pas égaux");
		}

		Integer i1 = new Integer(1);
		if(e1.equals(i1)) {
			System.out.println("égaux");
		}
	}

}
