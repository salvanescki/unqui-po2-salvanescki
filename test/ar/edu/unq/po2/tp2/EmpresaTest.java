package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {

	private EmpleadoPlantaPermanente juan = new EmpleadoPlantaPermanente("Juan", "Calle falsa 123", "Casado",
			LocalDate.of(1978, Month.MAY, 2), 30000000, 2, 6);
	private EmpleadoPlantaTemporaria carlos = new EmpleadoPlantaTemporaria("Carlos", "Calle falsa 890", "Soltero",
			LocalDate.of(2001, Month.NOVEMBER, 1), 25000000, LocalDate.of(2024, Month.DECEMBER, 1), 6);
	private Empresa empresa = new Empresa("Empre S.A", 334608698233l);

	@BeforeEach
	void setUp() {
		empresa.contratarEmpleado(juan);
		empresa.contratarEmpleado(carlos);
	}

	@Test
	void totalSueldosNetosTest() {
		assertEquals(42564700, empresa.totalSueldosNetos());
	}

	@Test
	void liquidacionDeSueldosTest() {
		empresa.liquidarSueldos();
		assertTrue(true);
	}

}
