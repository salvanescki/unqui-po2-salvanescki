package ar.edu.unq.po2.tp10.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNaiveTest {
	
	private EncriptadorNaive encryptor;
	private EncryptionStrategy orderChanger;
	private EncryptionStrategy vowelShifter;
	private EncryptionStrategy charToNumber;

	@BeforeEach
	void setUp() throws Exception {
		encryptor = new EncriptadorNaive();
		orderChanger = new OrderChangerEncryption();
		vowelShifter = new VowelShifterEncryption();
		charToNumber = new CharToNumberEncryption();
	}

	@Test
	void cambiarOrdenDePalabrasTest() {
		encryptor.changeEncryptor(orderChanger);
		String rawPassword = "hola soy nicolás";
		String encryptedPassword = encryptor.encriptar(rawPassword);
		assertNotEquals(rawPassword, encryptedPassword);
		assertEquals("nicolás soy hola", encryptedPassword);
		assertEquals(rawPassword, encryptor.desencriptar(encryptedPassword));
	}
	
	@Test
	void cambiarVocalesTest() {
		encryptor.changeEncryptor(vowelShifter);
		String rawPassword = "esternocleidomastoideo";
		String encryptedPassword = encryptor.encriptar(rawPassword);
		assertNotEquals(rawPassword, encryptedPassword);
		assertEquals("istirnucliodumestuodiu", encryptedPassword);
		assertEquals(rawPassword, encryptor.desencriptar(encryptedPassword));
	}
	
	@Test
	void cambiarLetrasPorNumerosTest() {
		encryptor.changeEncryptor(charToNumber);
		String rawPassword = "un paralelogramo";
		String encryptedPassword = encryptor.encriptar(rawPassword);
		assertNotEquals(rawPassword, encryptedPassword);
		assertEquals("22,14,0,17,1,19,1,12,5,12,16,7,19,1,13,16", encryptedPassword);
		assertEquals(rawPassword, encryptor.desencriptar(encryptedPassword));
	}

}
