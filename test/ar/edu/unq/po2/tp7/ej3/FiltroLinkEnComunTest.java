package ar.edu.unq.po2.tp7.ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroLinkEnComunTest {
	
	private FiltroLinkEnComun filtro;
	private WikipediaPage gelp;
	private WikipediaPage laPlata;
	private WikipediaPage buenosAires;
	private List<WikipediaPage> wikipedia;

	@BeforeEach
	void setUp() throws Exception {
		filtro = new FiltroLinkEnComun();
		gelp = mock(WikipediaPage.class);
		laPlata = mock(WikipediaPage.class);
		buenosAires = mock(WikipediaPage.class);
		wikipedia = Arrays.asList(gelp, laPlata, buenosAires);
		
		when(gelp.getLinks()).thenReturn(Arrays.asList(laPlata));
		when(laPlata.getLinks()).thenReturn(Arrays.asList(buenosAires));
		when(buenosAires.getLinks()).thenReturn(Arrays.asList(laPlata));
	}

	@Test
	void areSimilarTest() {
		assertTrue(filtro.areSimilar(gelp, buenosAires));
	}
	
	@Test
	void areNotSimilarTest() {
		assertFalse(filtro.areSimilar(gelp, laPlata));
		assertFalse(filtro.areSimilar(buenosAires, laPlata));
	}
	
	@Test
	void getSimilarPagesTest(){
		List<WikipediaPage> gelpSimilarPages = Arrays.asList(gelp, buenosAires);
		assertEquals(gelpSimilarPages, filtro.getSimilarPages(gelp, wikipedia));
	}
	
	@Test
	void getSimilarPagesEmptyTest(){
		List<WikipediaPage> listaVacia = new ArrayList<WikipediaPage>();
		assertEquals(listaVacia, filtro.getSimilarPages(laPlata, wikipedia));
	}

}
