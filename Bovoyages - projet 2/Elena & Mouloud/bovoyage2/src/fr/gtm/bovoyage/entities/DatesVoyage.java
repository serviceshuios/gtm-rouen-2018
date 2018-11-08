package fr.gtm.bovoyage.entities;

import java.util.Date;

/**
 * Classe modélisant les dates de voyage d'une destination<br>
 * <ul>
 * <li>date aller</li>
 * <li>date retour</li>
 * <li>prix du voyage</li>
 * </ul>
 * @author franck
 *
 */
public class DatesVoyage {
	private long id;
	private Date dateAller;
	private Date dateRetour;
	private double prixHT;
	
	public DatesVoyage() {}

	public DatesVoyage(Date dateAller, Date dateRetour, double prixHT) {
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
		this.prixHT = prixHT;
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

	public Date getDateAller() {
		return dateAller;
	}

	public void setDateAller(Date dateAller) {
		this.dateAller = dateAller;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	
	

}
