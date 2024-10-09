package ar.edu.unq.po2.tp10.ej1;

public enum Vowel {
	A, E, I, O, U;
	
	public static Vowel toVowel(String vowel) {
		return valueOf(vowel.toUpperCase());
	}
	
	public Vowel nextVowel() {
		return values()[(this.ordinal() + 1) % values().length];
	}
	
	public Vowel previousVowel() {
		return values()[(this.ordinal() + values().length - 1) % values().length];
	}
	
	public char toLowerCase() {
		return this.name().toLowerCase().charAt(0);
	}
	
	public char toUpperCase() {
		return this.name().toUpperCase().charAt(0);
	}
}
