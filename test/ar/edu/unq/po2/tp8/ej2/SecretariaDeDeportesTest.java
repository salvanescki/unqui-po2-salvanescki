package ar.edu.unq.po2.tp8.ej2;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretariaDeDeportesTest {
	
	private SecretariaDeDeportes quilmes;
	private ActividadSemanal basketLunes;
	private ActividadSemanal futbolMartes;
	private ActividadSemanal tenisMiercoles;
	private ActividadSemanal futbolJueves;
	private ActividadSemanal tenisViernes;
	private ActividadSemanal basketSabado;
	private ActividadSemanal jabalinaDomingo;
	private ActividadSemanal runningDomingo;
	
	@BeforeEach
	void setUp() throws Exception {
		quilmes = new SecretariaDeDeportes();
		basketLunes = mock(ActividadSemanal.class);
		futbolMartes = mock(ActividadSemanal.class);
		tenisMiercoles = mock(ActividadSemanal.class);
		futbolJueves = mock(ActividadSemanal.class);
		tenisViernes = mock(ActividadSemanal.class);
		basketSabado = mock(ActividadSemanal.class);
		jabalinaDomingo = mock(ActividadSemanal.class);
		runningDomingo = mock(ActividadSemanal.class);
		
		when(basketLunes.getDeporte()).thenReturn(Deporte.BASKET);
		when(futbolMartes.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(tenisMiercoles.getDeporte()).thenReturn(Deporte.TENNIS);
		when(futbolJueves.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(tenisViernes.getDeporte()).thenReturn(Deporte.TENNIS);
		when(basketSabado.getDeporte()).thenReturn(Deporte.BASKET);
		when(jabalinaDomingo.getDeporte()).thenReturn(Deporte.JABALINA);
		when(runningDomingo.getDeporte()).thenReturn(Deporte.RUNNING);
		
		when(basketLunes.getDiaDeLaSemana()).thenReturn(DiaDeLaSemana.LUNES);
		when(futbolMartes.getDiaDeLaSemana()).thenReturn(DiaDeLaSemana.MARTES);
		when(tenisMiercoles.getDiaDeLaSemana()).thenReturn(DiaDeLaSemana.MIERCOLES);
		when(futbolJueves.getDiaDeLaSemana()).thenReturn(DiaDeLaSemana.JUEVES);
		when(tenisViernes.getDiaDeLaSemana()).thenReturn(DiaDeLaSemana.VIERNES);
		when(basketSabado.getDiaDeLaSemana()).thenReturn(DiaDeLaSemana.SABADO);
		when(jabalinaDomingo.getDiaDeLaSemana()).thenReturn(DiaDeLaSemana.DOMINGO);
		when(runningDomingo.getDiaDeLaSemana()).thenReturn(DiaDeLaSemana.DOMINGO);
		
		when(basketLunes.getDuracion()).thenReturn(1);
		when(futbolMartes.getDuracion()).thenReturn(2);
		when(tenisMiercoles.getDuracion()).thenReturn(3);
		when(futbolJueves.getDuracion()).thenReturn(2);
		when(tenisViernes.getDuracion()).thenReturn(3);
		when(basketSabado.getDuracion()).thenReturn(1);
		when(jabalinaDomingo.getDuracion()).thenReturn(3);
		when(runningDomingo.getDuracion()).thenReturn(1);
		
		when(basketLunes.getCosto()).thenReturn(500 + 200 * 2);
		when(futbolMartes.getCosto()).thenReturn(500 + 200 * 2);
		when(tenisMiercoles.getCosto()).thenReturn(500 + 200 * 3);
		when(futbolJueves.getCosto()).thenReturn(1000 + 200 * 2);
		when(tenisViernes.getCosto()).thenReturn(1000 + 200 * 3);
		when(basketSabado.getCosto()).thenReturn(1000 + 200 * 2);
		when(jabalinaDomingo.getCosto()).thenReturn(1000 + 200 * 4);
		when(runningDomingo.getCosto()).thenReturn(1000 + 200);
		
		quilmes.agregarActividadSemanal(basketLunes);
		quilmes.agregarActividadSemanal(futbolMartes);
		quilmes.agregarActividadSemanal(tenisMiercoles);
		quilmes.agregarActividadSemanal(futbolJueves);
		quilmes.agregarActividadSemanal(tenisViernes);
		quilmes.agregarActividadSemanal(basketSabado);
		quilmes.agregarActividadSemanal(jabalinaDomingo);
		quilmes.agregarActividadSemanal(runningDomingo);
	}

	@Test
	void getActividadesDeFutbolTest() {
		assertEquals(Arrays.asList(futbolMartes, futbolJueves), quilmes.getActividadesDeFutbol());
	}
	
	@Test
	void getActividadesDeComplejidad1Test() {
		assertEquals(Arrays.asList(runningDomingo), quilmes.getActividadesDeComplejidad(1));
	}
	
	@Test
	void getActividadesDeComplejidad2Test() {
		assertEquals(Arrays.asList(basketLunes, futbolMartes, futbolJueves, basketSabado), quilmes.getActividadesDeComplejidad(2));
	}
	
	@Test
	void getActividadesDeComplejidad3Test() {
		assertEquals(Arrays.asList(tenisMiercoles, tenisViernes), quilmes.getActividadesDeComplejidad(3));
	}
	
	@Test
	void getActividadesDeComplejidad4Test() {
		assertEquals(Arrays.asList(jabalinaDomingo), quilmes.getActividadesDeComplejidad(4));
	}
	
	@Test
	void totalHorasEnActividadesSemanalesTest() {
		assertEquals(16, quilmes.totalHorasEnActividadesSemanales());
	}

	@Test
	void actividadConMenorCostoDeFutbolTest() {
		assertEquals(futbolMartes, quilmes.actividadConMenorCostoDeDeporte(Deporte.FUTBOL));
	}
	
	@Test
	void actividadConMenorCostoDeBasketTest() {
		assertEquals(basketLunes, quilmes.actividadConMenorCostoDeDeporte(Deporte.BASKET));
	}
	
	@Test
	void actividadConMenorCostoDeTenisTest() {
		assertEquals(tenisMiercoles, quilmes.actividadConMenorCostoDeDeporte(Deporte.TENNIS));
	}
	
	@Test
	void actividadConMenorCostoDeRunningTest() {
		assertEquals(runningDomingo, quilmes.actividadConMenorCostoDeDeporte(Deporte.RUNNING));
	}
	
	@Test
	void actividadConMenorCostoDeJabalinaTest() {
		assertEquals(jabalinaDomingo, quilmes.actividadConMenorCostoDeDeporte(Deporte.JABALINA));
	}
	
	@Test
	void getListaDeDeportesYSuActividadDeMenorCostoTest() {
		Map<Deporte, ActividadSemanal> result = Map.of(
				Deporte.BASKET, basketLunes,
				Deporte.FUTBOL, futbolMartes,
				Deporte.TENNIS, tenisMiercoles,
				Deporte.JABALINA, jabalinaDomingo,
				Deporte.RUNNING, runningDomingo
		);
		assertEquals(result, quilmes.getListaDeDeportesYSuActividadDeMenorCosto());
	}

}
