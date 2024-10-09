package ar.edu.unq.po2.tp10.ej1;

import java.util.Arrays;
import java.util.Collections;

public class OrderChangerEncryption implements EncryptionStrategy {
	
	private String reverse(String input) {
		String[] words = input.split(" ");
		Collections.reverse(Arrays.asList(words));
		return String.join(" ", words);
	}

	@Override
	public String encriptar(String rawPassword) {
		return this.reverse(rawPassword);
	}

	@Override
	public String desencriptar(String encryptedPassword) {
		return this.reverse(encryptedPassword);
	}

}
