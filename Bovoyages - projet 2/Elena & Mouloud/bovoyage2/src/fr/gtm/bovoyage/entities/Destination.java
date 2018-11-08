package fr.gtm.bovoyage.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe modélisant une destination de voyage<br>
 * Cette classe contient aussi le nom des images utilisées pour les affichages<br>
 * @author franck
 *
 */
public class Destination {
	private long id;
	private String region;
	private String description;
	private List<DatesVoyage> datesVoyages = new ArrayList<>();
	private List <String> images = new ArrayList<>();
	
	
	public Destination() {}
	
	public Destination(String region, String description) {
		this.region = region;
		this.description = description;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
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
	
	public void addDatesVoyage(DatesVoyage dates) {
		datesVoyages.add(dates);
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<DatesVoyage> getDatesVoyages() {
		return datesVoyages;
	}

	public void setDatesVoyages(List<DatesVoyage> datesVoyages) {
		this.datesVoyages = datesVoyages;
	}
	

}
