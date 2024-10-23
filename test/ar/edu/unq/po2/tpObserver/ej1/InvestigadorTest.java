package ar.edu.unq.po2.tpObserver.ej1;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvestigadorTest {
	
	private Investigador pepe;
	private Investigador juan;
	private SistemaDePublicaciones sistema;
	private Articulo art1;
	private Articulo art2;

	@BeforeEach
	void setUp() throws Exception {
		pepe = new Investigador();
		juan = new Investigador();
		sistema = new SistemaDePublicaciones();
		art1 = new Articulo("Articulo 1", 
				Arrays.asList("Autor 1", "Autor 2", "Autor 3"),
				List.of(new Filiacion("Universidad")),
				TipoDeArticulo.TESIS,
				new Lugar("Quilmes", "Buenos Aires", "Argentina"),
				Arrays.asList("keyword 1", "keyword 2", "keyword 3")
				);
		art2 = new Articulo("Articulo 2", 
				Arrays.asList("Autor 4", "Autor 5", "Autor 6"),
				List.of(new Filiacion("Laboratorio de Investigación")),
				TipoDeArticulo.INFORME,
				new Lugar("Montgomery", "Alabama", "United States"),
				Arrays.asList("keyword 4", "keyword 5", "keyword 6")
				);
	}
	
	@Test
	void suscribirCriterioPorTituloYElArticuloPublicadoNoCumpleTest() {
		pepe.suscribir(new CriterioPorTitulo("Articulo 1"), sistema);
		juan.publicar(art2, sistema);
		assertTrue(pepe.getNotificaciones().isEmpty());
	}
	
	@Test
	void suscribirCriterioPorTituloYElArticuloPublicadoSiCumpleTest() {
		pepe.suscribir(new CriterioPorTitulo("Articulo 1"), sistema);
		juan.publicar(art1, sistema);
		assertTrue(pepe.getNotificaciones().contains("Se ha publicado el artículo " + art1.getTitulo() + "."));
	}
	
	@Test
	void suscribirCriterioPorAutorYElArticuloPublicadoNoCumpleTest() {
		pepe.suscribir(new CriterioPorAutor("Autor 1"), sistema);
		juan.publicar(art2, sistema);
		assertTrue(pepe.getNotificaciones().isEmpty());
	}
	
	@Test
	void suscribirCriterioPorAutorYElArticuloPublicadoSiCumpleTest() {
		pepe.suscribir(new CriterioPorAutor("Autor 4"), sistema);
		juan.publicar(art2, sistema);
		assertTrue(pepe.getNotificaciones().contains("Se ha publicado el artículo " + art2.getTitulo() + "."));
	}
	
	@Test
	void suscribirCriterioPorFiliacionYElArticuloPublicadoNoCumpleTest() {
		pepe.suscribir(new CriterioPorFiliacion(new Filiacion("Universidad")), sistema);
		juan.publicar(art2, sistema);
		assertTrue(pepe.getNotificaciones().isEmpty());
	}
	
	@Test
	void suscribirCriterioPorFiliacionYElArticuloPublicadoSiCumpleTest() {
		pepe.suscribir(new CriterioPorFiliacion(new Filiacion("Universidad")), sistema);
		juan.publicar(art1, sistema);
		assertTrue(pepe.getNotificaciones().contains("Se ha publicado el artículo " + art1.getTitulo() + "."));
	}
	
	@Test
	void suscribirCriterioPorTipoDeArticuloYElArticuloPublicadoNoCumpleTest() {
		pepe.suscribir(new CriterioPorTipoDeArticulo(TipoDeArticulo.INFORME), sistema);
		juan.publicar(art1, sistema);
		assertTrue(pepe.getNotificaciones().isEmpty());
	}
	
	@Test
	void suscribirCriterioPorTipoDeArticuloYElArticuloPublicadoSiCumpleTest() {
		pepe.suscribir(new CriterioPorTipoDeArticulo(TipoDeArticulo.INFORME), sistema);
		juan.publicar(art2, sistema);
		assertTrue(pepe.getNotificaciones().contains("Se ha publicado el artículo " + art2.getTitulo() + "."));
	}
	
	@Test
	void suscribirCriterioPorLugarDePublicacionYElArticuloPublicadoNoCumpleTest() {
		pepe.suscribir(new CriterioPorLugarDePublicacion(new Lugar("Quilmes", "Buenos Aires", "Argentina")), sistema);
		juan.publicar(art2, sistema);
		assertTrue(pepe.getNotificaciones().isEmpty());
	}
	
	@Test
	void suscribirCriterioPorLugarDePublicacionYElArticuloPublicadoSiCumpleTest() {
		pepe.suscribir(new CriterioPorLugarDePublicacion(new Lugar("Quilmes", "Buenos Aires", "Argentina")), sistema);
		juan.publicar(art1, sistema);
		assertTrue(pepe.getNotificaciones().contains("Se ha publicado el artículo " + art1.getTitulo() + "."));
	}
	
	@Test
	void suscribirCriterioPorPalabrasClaveYElArticuloPublicadoNoCumpleTest() {
		pepe.suscribir(new CriterioPorPalabrasClave(List.of("keyword 3")), sistema);
		juan.publicar(art2, sistema);
		assertTrue(pepe.getNotificaciones().isEmpty());
	}
	
	@Test
	void suscribirCriterioPorPalabrasClaveYElArticuloPublicadoSiCumpleTest() {
		pepe.suscribir(new CriterioPorPalabrasClave(List.of("keyword 3")), sistema);
		juan.publicar(art1, sistema);
		assertTrue(pepe.getNotificaciones().contains("Se ha publicado el artículo " + art1.getTitulo() + "."));
	}

}
