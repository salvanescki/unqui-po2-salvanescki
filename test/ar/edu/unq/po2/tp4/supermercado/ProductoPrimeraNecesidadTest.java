package ar.edu.unq.po2.tp4.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoPrimeraNecesidad("Arroz", 18.9d, false, 0.08);
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.11);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(17.38), arroz.getPrecio());
		assertEquals(new Double(7.12), leche.getPrecio());
	}
}
