package ar.edu.unq.po2.tpComposite.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelaTest {
	
	private Parcela parcelaSoja;
	private Parcela parcelaTrigo;
	private Parcela parcela;
	
	@BeforeEach
	void setUp() {
		parcelaSoja = new ParcelaSoja();
		parcelaTrigo = new ParcelaTrigo();
	}

	@Test
	void gananciaSojaTest() {
		assertEquals(500, parcelaSoja.ganancia());
	}
	
	@Test
	void gananciaTrigoTest() {
		assertEquals(300, parcelaTrigo.ganancia());
	}
	
	@Test
	void gananciaCuatroSojasTest() {
		parcela = new ParcelaMixta(parcelaSoja, parcelaSoja, parcelaSoja, parcelaSoja);
		assertEquals(500 * 4, parcela.ganancia());
	}
	
	@Test
	void gananciaCuatroTrigosTest() {
		parcela = new ParcelaMixta(parcelaTrigo, parcelaTrigo, parcelaTrigo, parcelaTrigo);
		assertEquals(300 * 4, parcela.ganancia());
	}
	
	@Test
	void gananciaMitadSojaMitadTrigoTest() {
		parcela = new ParcelaMixta(parcelaSoja, parcelaTrigo, parcelaTrigo, parcelaSoja);
		assertEquals(500 * 2 + 300 * 2, parcela.ganancia());
	}
	
	@Test
	void gananciaMixtaDeMixtas() {
		parcela = new ParcelaMixta(new ParcelaMixta(parcelaSoja, parcelaSoja, parcelaSoja, parcelaSoja), 
								   new ParcelaMixta(parcelaTrigo, parcelaTrigo, parcelaTrigo, parcelaTrigo), 
								   new ParcelaMixta(parcelaSoja, parcelaTrigo, parcelaTrigo, parcelaSoja), 
								   new ParcelaMixta(parcelaTrigo, parcelaSoja, parcelaSoja, parcelaTrigo));
		assertEquals(500 * 4 +
					 300 * 4 +
					 500 * 2 + 300 * 2 +
					 300 * 2 + 500 * 2, 
					 parcela.ganancia());
	}
	
	@Test
	void gananciaMixtaDeSojaTrigoSojaYMixta() {
		parcela = new ParcelaMixta(parcelaSoja,
								   parcelaTrigo,
								   parcelaSoja,
								   new ParcelaMixta(parcelaTrigo, parcelaSoja, parcelaSoja, parcelaTrigo));
		assertEquals(500 +
					 300 +
					 500 +
					 300 * 2 + 500 * 2, 
					 parcela.ganancia());
	}

}
