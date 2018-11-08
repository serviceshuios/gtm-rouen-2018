package fr.gtm.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class MainMap {

	public static void main(String[] args) {
		Map<String, Foo> map = new HashMap<>();
		
		// boucle de remplissage
		for(int i=0 ; i<10 ; i++) {
			map.put("i"+i, new Foo(i));
		}
		
		for(String key : map.keySet()) {
			System.out.println(key+" => "+map.get(key));
		}
		System.out.println("================");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k+" => "+map.get(k));
		}
		System.out.println("================");
		
		for(Entry<String, Foo> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}
		System.out.println("================");
	
		// classe anonyme
		// on fournit le code de l'interface "à la volée"
		map.forEach(new BiConsumer<String, Foo>() {

			@Override
			public void accept(String t, Foo u) {
				System.out.println(t+" => "+u);
				
			}
		});
		System.out.println("================");
		
		// fonction anonyme (lambda) qui remplace l'instance
		// de l'interface fonctionnelle BiConsumer
		map.forEach((k,v)->System.out.println(k+" => "+v));

	}

}
