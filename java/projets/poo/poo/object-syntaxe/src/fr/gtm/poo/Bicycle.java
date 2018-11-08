package fr.gtm.poo;

public class Bicycle {
	private Roue roueAvant;
	private Roue roueArriere;
	
	public void accelerer() {
		System.out.println("Le vélo accélère");
	}
	
	public void accelerer(int vitesseMax){
		System.out.println("Le vélo accélère jusqu'à "+vitesseMax+" km/h");
	}
	public Roue getRoueAvant() {
		return roueAvant;
	}
	public void setRoueAvant(Roue roueAvant) {
		this.roueAvant = roueAvant;
	}
	public Roue getRoueArriere() {
		return roueArriere;
	}
	public void setRoueArriere(Roue roueArriere) {
		this.roueArriere = roueArriere;
	}
	
}
