package fr.gtm.array;

import java.util.Random;

public class MainDivers {

	public static void main(String[] args) {
		// Création d'un tableau de 100 entiers
		// le tableau est vide
		int[] tabInts = new int[10];
		
		// Remplissage du tableau
		tabInts = remplir(tabInts);
		
		long somme = somme(tabInts);
		
		int min = minimum(tabInts);
		int max = maximum(tabInts);
		
		System.out.println(String.format("Somme du tableau %d", somme));
		System.out.println(String.format("Minimum du tableau %d", min));
		System.out.println(String.format("Maximum du tableau %d", max));
	}

	private static int maximum(int[] tabInts) {
		/*
		 * max = tab[0]
		 * pour i=1 jusqu'à tabInts.length
		 * 		si tab[i] > max alors
		 * 			max = tab[i]
		 * 		fin si
		 * fin pour
		 */
		int max = tabInts[0];
		for(int i=1 ; i<tabInts.length ; i++) {
			if(tabInts[i]>max) {
				max = tabInts[i];
			}
		}
		return max;
	}

	/**
	 * 
	 * @param tabInts
	 * @return la valeur minimale des éléments du tableau
	 */
	private static int minimum(int[] tabInts) {
		/*
		 * min = tab[0]
		 * pour i=1 jusqu'à tabInts.length
		 * 		si tab[i] < min alors
		 * 			min = tab[i]
		 * 		fin si
		 * fin pour
		 */
		int min = tabInts[0];
		for(int i=1 ; i<tabInts.length ; i++) {
			if(tabInts[i]<min) {
				min = tabInts[i];
			}
		}
		return min;
	}

	private static int[] remplir(int[] tabInts) {
//		Random random = new Random();
//		for(int i=0 ; i< tabInts.length ; ++i) {
//			tabInts[i] = random.nextInt(100);
//		}
		
		tabInts = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,-1};
		return tabInts;
	}

	/**
	 * 
	 * @param tabInts tableau d'entier int
	 * @return la somme du tableau
	 */
	private static long somme(int[] tabInts) {
		long t = 0;
//		for(int i=0 ; i<tabInts.length ; i++) {
//			t += tabInts[i];
//		}
		
		int i = 0; // compteur de boucle
		while(i<tabInts.length) {
			t += tabInts[i++];
			//i++; // on incrémente le compteur de boucle
		}
		return t;
	}

}
