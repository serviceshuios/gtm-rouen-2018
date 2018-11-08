package fr.gtm.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainListDoublons {

	public static void main(String[] args) {
		List<Foo> foos = new ArrayList<Foo>();
		
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
