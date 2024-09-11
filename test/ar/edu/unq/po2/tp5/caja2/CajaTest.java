package ar.edu.unq.po2.tp5.caja2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Producto arroz;
	private Producto leche;
	private Producto azúcar;
	private Servicio agua;
	private Servicio luz;
	private Servicio gas;
	private Agencia afip;
	private Impuesto ganancias;
	private Impuesto automotor;
	private Impuesto municipal;
	private Caja caja;

	@BeforeEach
	void setUp() throws Exception {
		arroz = new Producto("Arroz", 1000, 90000);
		leche = new Producto("Leche", 1000, 100000);
		azúcar = new Producto("Leche", 1000, 80000);
		agua = new Servicio(afip, 20, 20000);
		luz = new Servicio(afip, 40, 20000);
		gas = new Servicio(afip, 30, 20000);
		ganancias = new Impuesto(afip, 10000000);
		automotor = new Impuesto(afip, 320000);
		municipal = new Impuesto(afip, 80000);
		caja = new Caja();
	}

	@Test
	void montoAPagarProductosTest() {
		caja.registrarImporte(arroz, 2);
		caja.registrarImporte(leche);
		caja.registrarImporte(azúcar);
		assertEquals(360000, caja.montoAPagar());
	}
	
	@Test
	void productosStockTest() {
		caja.registrarImporte(arroz, 4);
		caja.registrarImporte(leche, 3);
		caja.registrarImporte(azúcar, 10);
		caja.procesarPago();
		assertEquals(996, arroz.getStock());
		assertEquals(997, leche.getStock());
		assertEquals(990, azúcar.getStock());
	}
	
	@Test
	void montoAPagarFacturasTest() {
		caja.registrarImporte(agua);
		caja.registrarImporte(luz);
		caja.registrarImporte(gas);
		caja.registrarImporte(ganancias);
		caja.registrarImporte(automotor);
		caja.registrarImporte(municipal);
		assertEquals(12200000, caja.montoAPagar());
	}

}
