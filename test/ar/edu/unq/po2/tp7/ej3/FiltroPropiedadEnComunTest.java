package ar.edu.unq.po2.tp7.ej3;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroPropiedadEnComunTest {
	
	private FiltroPropiedadEnComun filtro;
	private WikipediaPage jorgeGomez;
	private WikipediaPage juanDiaz;
	private WikipediaPage arrozConTuco;
	private List<WikipediaPage> wikipedia;
	private Map<String, WikipediaPage> jorgeGomezProperties;
	private Map<String, WikipediaPage> juanDiazProperties;
	private Map<String, WikipediaPage> arrozConTucoProperties;

	@BeforeEach
	void setUp() throws Exception {
		filtro = new FiltroPropiedadEnComun();
		jorgeGomez = mock(WikipediaPage.class);
		juanDiaz = mock(WikipediaPage.class);
		arrozConTuco = mock(WikipediaPage.class);
		wikipedia = Arrays.asList(jorgeGomez, juanDiaz, arrozConTuco);
		
		when(jorgeGomez.getInfobox()).thenReturn(jorgeGomezProperties);
		when(juanDiaz.getInfobox()).thenReturn(juanDiazProperties);
		when(arrozConTuco.getInfobox()).thenReturn(arrozConTucoProperties);
		
		jorgeGomezProperties = new HashMap<String, WikipediaPage>();
		jorgeGomezProperties.put("birth_place", mock(WikipediaPage.class));
		
		juanDiazProperties = new HashMap<String, WikipediaPage>();
		juanDiazProperties.put("birth_place", mock(WikipediaPage.class));
		
		arrozConTucoProperties = new HashMap<String, WikipediaPage>();
		arrozConTucoProperties.put("country", mock(WikipediaPage.class));
	}

	@Test
	void areSimilarTest() {
		assertTrue(filtro.areSimilar(jorgeGomez, juanDiaz));
	}
	
	@Test
	void areNotSimilarTest() {
		assertFalse(filtro.areSimilar(jorgeGomez, arrozConTuco));
		assertFalse(filtro.areSimilar(juanDiaz, arrozConTuco));
	}
	
	@Test
	void getSimilarPagesTest(){
		List<WikipediaPage> jorgeGomezSimilarPages = Arrays.asList(jorgeGomez, juanDiaz);
		assertEquals(jorgeGomezSimilarPages, filtro.getSimilarPages(jorgeGomez, wikipedia));
	}
	
	@Test
	void getSimilarPagesEmptyTest(){
		List<WikipediaPage> listaVacia = new ArrayList<WikipediaPage>();
		assertEquals(listaVacia, filtro.getSimilarPages(arrozConTuco, wikipedia));
	}


}
