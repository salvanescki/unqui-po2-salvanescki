package ar.edu.unq.po2.tpSOLID.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {
	
	private Banco bancoNacion;
	private Cliente raul;
	private Cliente pedro;
	private Cliente pablo;
	private Cliente jorge;
	private PropiedadInmobiliaria casaPedro;

	@BeforeEach
	void setUp() throws Exception {
		bancoNacion = new Banco();
		raul = new Cliente("Raul", "Perez", "Calle falsa 321", 57, 60000000);
		pedro = new Cliente("Pedro", "Gomez", "Calle falsa 213", 20, 30000000);
		pablo = new Cliente("Pablo", "Diaz", "Calle falsa 231", 34, 120000000);
		jorge = new Cliente("Jorge", "Lopez", "Calle falsa 132", 65, 120000000);
		casaPedro = new PropiedadInmobiliaria("La casa de Pedro", "Calle false 213", 6000000000l);
		
		bancoNacion.agregarCliente(raul);
		bancoNacion.agregarCliente(pedro);
		bancoNacion.agregarCliente(pablo);
	}

	@Test
	void solicitarCreditoTest() {
		bancoNacion.solicitarCreditoPersonal(raul, 120000);
		assertEquals(120000, raul.getAhorros());
	}
	
	@Test
	void montoTotalSolicitudesCreditoPersonalTest() {
		bancoNacion.solicitarCreditoPersonal(raul, 12000000);
		bancoNacion.solicitarCreditoPersonal(pedro, 22500000); // supera el 70% de sus ingresos mensuales
		bancoNacion.solicitarCreditoPersonal(pablo, 20000000);
		assertEquals(32000000, bancoNacion.montoTotalSolicitudesCredito());
	}
	
	@Test
	void montoTotalSolicitudesCreditoHipotecarioTest() {
		bancoNacion.solicitarCreditoHipotecario(raul, 12000000, casaPedro);
		bancoNacion.solicitarCreditoHipotecario(pedro, 6000000000l, casaPedro); // es el mismo valor que el fiscal
		bancoNacion.solicitarCreditoHipotecario(pablo, 20000000, casaPedro);
		assertEquals(32000000, bancoNacion.montoTotalSolicitudesCredito());
	}
	
	@Test
	void montoTotalSolicitudesCreditoHipotecarioEdadTest() {
		bancoNacion.solicitarCreditoHipotecario(raul, 12000000, casaPedro);
		bancoNacion.solicitarCreditoHipotecario(pedro, 60000000, casaPedro);
		bancoNacion.solicitarCreditoHipotecario(pablo, 20000000, casaPedro);
		bancoNacion.solicitarCreditoHipotecario(jorge, 20000000, casaPedro); // Supera la edad al terminar de pagar
		assertEquals(92000000, bancoNacion.montoTotalSolicitudesCredito());
	}

}
