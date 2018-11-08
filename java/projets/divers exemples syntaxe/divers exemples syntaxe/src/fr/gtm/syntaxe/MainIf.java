package fr.gtm.syntaxe;

public class MainIf {

	public static void main(String[] args) {
		int i = 3;
		int j = 3;

		if (i == 2) {
			j = 5;
			j = 10;
		}	else
				j = 6;

		System.out.println("j vaut " + j);

	}

}
