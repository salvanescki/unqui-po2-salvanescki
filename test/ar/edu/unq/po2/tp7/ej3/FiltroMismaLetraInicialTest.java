package ar.edu.unq.po2.tp7.ej3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroMismaLetraInicialTest {
	
	private FiltroMismaLetraInicial filtro;
	private WikipediaPage bernal;
	private WikipediaPage quilmes;
	private WikipediaPage buenosAires;
	private List<WikipediaPage> wikipedia;

	@BeforeEach
	void setUp() throws Exception {
		filtro = new FiltroMismaLetraInicial();
		bernal = mock(WikipediaPage.class);
		quilmes = mock(WikipediaPage.class);
		buenosAires = mock(WikipediaPage.class);
		wikipedia = Arrays.asList(bernal, quilmes, buenosAires);
		
		when(bernal.getTitle()).thenReturn("Bernal");
		when(quilmes.getTitle()).thenReturn("Quilmes");
		when(buenosAires.getTitle()).thenReturn("Buenos Aires");
	}

	@Test
	void areSimilarTest(){
		assertTrue(filtro.areSimilar(bernal, bernal));
		assertTrue(filtro.areSimilar(bernal, buenosAires));
	}
	
	@Test
	void areNotSimilarTest(){
		assertFalse(filtro.areSimilar(bernal, quilmes));
		assertFalse(filtro.areSimilar(quilmes, buenosAires));
	}
	
	@Test
	void getSimilarPagesTest(){
		List<WikipediaPage> bernalSimilarPages = Arrays.asList(bernal, buenosAires);
		assertEquals(bernalSimilarPages, filtro.getSimilarPages(bernal, wikipedia));
	}
	
	@Test
	void getSimilarPagesEmptyTest(){
		List<WikipediaPage> listaVacia = new ArrayList<WikipediaPage>();
		assertEquals(listaVacia, filtro.getSimilarPages(quilmes, wikipedia));
	}
}
