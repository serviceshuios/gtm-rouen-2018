package fr.gtm.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		List<Foo> foos = new ArrayList<Foo>();
		
		// boucle de remplissage
		for(int i=0 ; i<10 ; i++) {
			foos.add(new Foo(i));
		}
		
		// parcours par un itérateur
		Iterator<Foo> it = foos.iterator();
		while(it.hasNext()) {
			Foo foo = it.next();
			System.out.println(foo);
		}
		
		// parcours par for
		for(int j=0 ; j<foos.size() ; j++) {
			Foo foo = foos.get(j);
			System.out.println(foo);
		}
		
		// parcours par foreach
		for(Foo foo : foos) {
			System.out.println(foo);
		}
		

	}

}
