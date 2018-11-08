package fr.gtm.bovoyage.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe modélisant un voyage<br>
 * Le voyage reprend la région et le descriptif de la destination<br>
 * Il comporte les participants au voyage
 * @author franck
 *
 */
public class Voyage {
	private long id;
	private String region;
	private String descriptif;
	private DatesVoyage datesVoyage;
	private List<Voyageur> voyageurs = new ArrayList<>();
	
	public Voyage() {}
		
	public Voyage(String region, String descriptif) {
		this.region = region;
		this.descriptif = descriptif;
	}

	public Voyage(String region, String descriptif, DatesVoyage datesVoyage) {
		this.region = region;
		this.descriptif = descriptif;
		this.datesVoyage = datesVoyage;
	}

	public Voyage(String region, String descriptif, DatesVoyage datesVoyage, List<Voyageur> voyageurs) {
		this.region = region;
		this.descriptif = descriptif;
		this.datesVoyage = datesVoyage;
		this.voyageurs = voyageurs;
	}

	public void addVoyageur(Voyageur voyageur) {
		voyageurs.add(voyageur);
	}
	
	public double getPrixHT() {
		return voyageurs.size()*datesVoyage.getPrixHT();
	}

	/**
	 * ID de synchronisation avec la clé primaire
	 * @return
	 */
	public long getId() {
		return id;
	}
	/**
	 * ID de synchronisation avec la clé primaire
	 * <h3>Ne doit pas être mis à jour en dehors du DAO</h3>
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public List<Voyageur> getVoyageurs() {
		return voyageurs;
	}
	public void setVoyageurs(List<Voyageur> voyageurs) {
		this.voyageurs = voyageurs;
	}

	public DatesVoyage getDatesVoyage() {
		return datesVoyage;
	}

	public void setDatesVoyage(DatesVoyage datesVoyage) {
		this.datesVoyage = datesVoyage;
	}
	
	

}
