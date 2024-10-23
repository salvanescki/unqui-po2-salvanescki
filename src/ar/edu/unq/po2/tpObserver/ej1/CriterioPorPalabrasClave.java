package ar.edu.unq.po2.tpObserver.ej1;

import java.util.List;

public class CriterioPorPalabrasClave implements CriterioDeSuscripcion {
	
	private List<String> palabrasClave;
	
	public CriterioPorPalabrasClave(List<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}

	@Override
	public boolean cumpleConCriterio(Articulo articulo) {
		return articulo.getPalabrasClave().stream()
										  .anyMatch(palabrasClave::contains);
	}

}
