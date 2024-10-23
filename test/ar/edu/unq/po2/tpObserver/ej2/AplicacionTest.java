package ar.edu.unq.po2.tpObserver.ej2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AplicacionTest {

	private Aplicacion app;
	private Suscriptor server1;
	private Suscriptor server2;
	private Suscriptor mobApp1;
	private Suscriptor mobApp2;
	
	private Partido bocaIndependiente;
	private Partido bocaRiver;
	private Partido riverSanLorenzo;
	private Partido independienteRacing;
	
	@BeforeEach
	void setUp() throws Exception {
		app = new Aplicacion();
		server1 = new Servidor();
		server2 = new Servidor();
		mobApp1 = new AplicacionMovil();
		mobApp2 = new AplicacionMovil();
		
		bocaIndependiente = new Partido("4 - 5", List.of("Boca", "Independiente"), "Futbol");
		bocaRiver = new Partido("3 - 2", List.of("Boca", "River"), "League of Legends");
		riverSanLorenzo = new Partido("1 - 1", List.of("River", "San Lorenzo"), "Futbol");
		independienteRacing = new Partido("3 - 0", List.of("Independiente", "Racing"), "League of Legends");
		
		server1.suscribirDeporte("Futbol");
		server2.suscribirDeporte("League of Legends");
		mobApp1.suscribirCompetidor("Independiente");
		mobApp2.suscribirCompetidor("Boca");
		
		app.agregarSuscriptor(server1);
		app.agregarSuscriptor(server2);
		app.agregarSuscriptor(mobApp1);
		app.agregarSuscriptor(mobApp2);
	}

	@Test
	void soloDeporteFutbolTest() {
		app.agregarPartido(bocaIndependiente);
		app.agregarPartido(riverSanLorenzo);
		
		assertTrue(server1.getNotificaciones().contains(bocaIndependiente.getResultado()));
		assertTrue(server1.getNotificaciones().contains(riverSanLorenzo.getResultado()));
		assertTrue(server2.getNotificaciones().isEmpty());
		assertTrue(mobApp1.getNotificaciones().contains(bocaIndependiente.getResultado()));
		assertTrue(mobApp2.getNotificaciones().contains(bocaIndependiente.getResultado()));
	}
	
	@Test
	void soloDeporteLeagueTest() {
		app.agregarPartido(bocaRiver);
		app.agregarPartido(independienteRacing);
		
		assertTrue(server2.getNotificaciones().contains(bocaRiver.getResultado()));
		assertTrue(server2.getNotificaciones().contains(independienteRacing.getResultado()));
		assertTrue(server1.getNotificaciones().isEmpty());
		assertTrue(mobApp1.getNotificaciones().contains(independienteRacing.getResultado()));
		assertTrue(mobApp2.getNotificaciones().contains(bocaRiver.getResultado()));
	}
	
	@Test
	void todosLosDeportesTest() {
		app.agregarPartido(bocaIndependiente);
		app.agregarPartido(bocaRiver);
		app.agregarPartido(riverSanLorenzo);
		app.agregarPartido(independienteRacing);
		
		assertTrue(server1.getNotificaciones().contains(bocaIndependiente.getResultado()));
		assertTrue(server1.getNotificaciones().contains(riverSanLorenzo.getResultado()));
		assertTrue(mobApp1.getNotificaciones().contains(bocaIndependiente.getResultado()));
		assertTrue(mobApp2.getNotificaciones().contains(bocaIndependiente.getResultado()));
		assertTrue(server2.getNotificaciones().contains(bocaRiver.getResultado()));
		assertTrue(server2.getNotificaciones().contains(independienteRacing.getResultado()));
		assertTrue(mobApp1.getNotificaciones().contains(independienteRacing.getResultado()));
		assertTrue(mobApp2.getNotificaciones().contains(bocaRiver.getResultado()));
	}

}
