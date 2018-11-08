package fr.gtm.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		Set<Foo> foos = new HashSet<Foo>();
		
		// boucle de remplissage
		for(int i=0 ; i<10 ; i++) {
			foos.add(new Foo(i));
			foos.add(new Foo(i));
		}
		
		// parcours par foreach
		for(Foo foo : foos) {
			System.out.println(foo);
		}
		

	}

}
