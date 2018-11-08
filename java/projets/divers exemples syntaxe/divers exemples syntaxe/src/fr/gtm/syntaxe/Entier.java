package fr.gtm.syntaxe;

public class Entier {
	private int value;


	public Entier(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Entier) {
			Entier e = (Entier) obj;
			return e.value == this.value;
		}
		return false;
	}
	
}
