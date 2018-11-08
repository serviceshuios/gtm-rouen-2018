package fr.gtm.mammifere;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Mammifere> mammiferes = new ArrayList<>();
	
	public void add(Mammifere mammifere) {
		mammiferes.add(mammifere);
	}
	
	public void fairePeur() {
//		for(int i=0 ; i<mammiferes.size(); i++) {
//			mammiferes.get(i).crier();
//		}
		for(Mammifere mammifere : mammiferes) {
			mammifere.crier();
		}
	}
}
