package fr.gtm.feu;

import java.util.ArrayList;
import java.util.List;

public class FeuCirculation {
	private List<Vehicule> vehicules = new ArrayList<>();
	
	public void add(Vehicule vehicule) {
		vehicules.add(vehicule);
	}
	
	public void passerAuVert() {
		for(Vehicule v : vehicules) {
			v.demarrer();
		}
		vehicules.clear();
	}
}
