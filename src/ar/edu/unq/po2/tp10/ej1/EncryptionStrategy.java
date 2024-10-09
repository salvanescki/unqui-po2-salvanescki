package ar.edu.unq.po2.tp10.ej1;

public interface EncryptionStrategy {
	public String encriptar(String rawPassword);
	public String desencriptar(String encryptedPassword);
}
