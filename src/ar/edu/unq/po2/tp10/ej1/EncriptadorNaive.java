package ar.edu.unq.po2.tp10.ej1;

public class EncriptadorNaive {

	private EncryptionStrategy encryptionStrategy;
	
	public EncriptadorNaive(){
		this.encryptionStrategy = new OrderChangerEncryption();
	}
	
	public void changeEncryptor(EncryptionStrategy newEncryptor) {
		this.encryptionStrategy = newEncryptor;
	}

	public String encriptar(String rawPassword) {
		return encryptionStrategy.encriptar(rawPassword);
	}

	public String desencriptar(String encryptedPassword) {
		return encryptionStrategy.desencriptar(encryptedPassword);
	}
	
}
