package fr.gtm.mammifere;

public class MainMammifere {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		
		zoo.add(new Chat());
		zoo.add(new Chat());
		zoo.add(new Chien());
		zoo.add(new Elephant());
		
		zoo.fairePeur();
		
	}

}
