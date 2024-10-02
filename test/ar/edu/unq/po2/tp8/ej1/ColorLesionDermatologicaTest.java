package ar.edu.unq.po2.tp8.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ColorLesionDermatologicaTest {
	
	/*
	 * ROJO("Lesión en estado de inflamación"),
	 * GRIS("Lesión cicatrizando"),
	 * AMARILLO("Lesion recuperándose"),
	 * MIEL("Lesión casi completamente curada");
	 * */

	@Test
	void getDescripcionTest() {
		assertEquals("Lesión en estado de inflamación", ColorLesionDermatologica.ROJO.getDescripcion());
		assertEquals("Lesión cicatrizando", ColorLesionDermatologica.GRIS.getDescripcion());
		assertEquals("Lesion recuperándose", ColorLesionDermatologica.AMARILLO.getDescripcion());
		assertEquals("Lesión casi completamente curada", ColorLesionDermatologica.MIEL.getDescripcion());
	}
	
	@Test
	void proximoColorTest() {
		assertEquals(ColorLesionDermatologica.GRIS, ColorLesionDermatologica.ROJO.proximoColor());
		assertEquals(ColorLesionDermatologica.AMARILLO, ColorLesionDermatologica.GRIS.proximoColor());
		assertEquals(ColorLesionDermatologica.MIEL, ColorLesionDermatologica.AMARILLO.proximoColor());
		assertEquals(ColorLesionDermatologica.ROJO, ColorLesionDermatologica.MIEL.proximoColor());
	}

}
