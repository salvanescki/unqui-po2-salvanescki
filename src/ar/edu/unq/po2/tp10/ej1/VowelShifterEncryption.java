package ar.edu.unq.po2.tp10.ej1;

import java.util.stream.Collectors;

public class VowelShifterEncryption implements EncryptionStrategy {
	
	private static boolean isVowel(char c) {
		return "AEIOUaeiou".indexOf(c) != -1;
	}
	
	private static char getNextVowel(char c) {
		Vowel vowel = Vowel.toVowel(c + "");
		Vowel nextVowel = vowel.nextVowel();
		
		return Character.isUpperCase(c)? nextVowel.toUpperCase() : nextVowel.toLowerCase();
	}
	
	private static char getPreviousVowel(char c) {
		Vowel vowel = Vowel.toVowel(c + "");
		Vowel previousVowel = vowel.previousVowel();
		
		return Character.isUpperCase(c)? previousVowel.toUpperCase() : previousVowel.toLowerCase();
	}

	@Override
	public String encriptar(String rawPassword) {
		return rawPassword.chars()
						  .mapToObj(c -> (char) c)
						  .map(c -> isVowel(c)? getNextVowel(c) : c)
						  .map(String::valueOf)
						  .collect(Collectors.joining());
	}

	@Override
	public String desencriptar(String encryptedPassword) {
		return encryptedPassword.chars()
								.mapToObj(c -> (char) c)
								.map(c -> isVowel(c)? getPreviousVowel(c) : c)
								.map(String::valueOf)
								.collect(Collectors.joining());
	}

}
