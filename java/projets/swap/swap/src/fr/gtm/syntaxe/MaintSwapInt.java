package fr.gtm.syntaxe;

public class MaintSwapInt {
	public static void main(String[] args) {
		int i = 1;
		int j = 10;
		System.out.println(String.format("méthode main : i == %d et j == %d",i,j));
		swap(i,j);
		System.out.println(String.format("méthode main : i == %d et j == %d",i,j));
	}

	private static void swap(int i, int j) {
		System.out.println(String.format("méthode swap : i == %d et j == %d",i,j));
		int t = i;
		i = j;
		j = t;
		System.out.println(String.format("méthode swap : i == %d et j == %d",i,j));
	}
}
