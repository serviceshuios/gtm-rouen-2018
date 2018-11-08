package fr.gtm.syntaxe;

public class MainSwapInteger {

	public static void main(String[] args) {
		Entier i = new Entier(1);
		Entier j = new Entier(10);
		System.out.println(String.format("méthode main : i == %d et j == %d",i.getValue(),j.getValue()));
		swap(i,j);
		System.out.println(String.format("méthode main : i == %d et j == %d",i.getValue(),j.getValue()));

	}

	private static void swap(Entier i, Entier j) {
		int t = i.getValue();
		i.setValue(j.getValue());
		j.setValue(t);
		
	}

}
