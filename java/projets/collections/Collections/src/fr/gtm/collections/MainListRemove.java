package fr.gtm.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainListRemove {

	public static void main(String[] args) {
		List<Foo> foos = new ArrayList<Foo>();
		
		// boucle de remplissage
		for(int i=0 ; i<10 ; i++) {
			foos.add(new Foo(i));
		}
		
		// parcours par un itérateur
		// et suppression par itérateur
		Iterator<Foo> it = foos.iterator();
		while(it.hasNext()) {
			Foo foo = it.next();
			if(foo.getData() == 5) {
				it.remove();
			}
		}
		
		// parcours par for
		// suppression par la collection
		for(int j=0 ; j<foos.size() ; j++) {
			Foo foo = foos.get(j);
			if(foo.getData()==7) {
				foos.remove(foo);
			}
		}
		show(foos);
		// parcours par foreach
		for(Foo foo : foos) {
			if(foo.getData()==1) {
				foos.remove(foo);
			}
			//System.out.println(foo);
		}
		

	}

	private static void show(List<Foo> foos) {
		for(Foo foo : foos) {
			System.out.println(foo);
		}
		
	}

}
