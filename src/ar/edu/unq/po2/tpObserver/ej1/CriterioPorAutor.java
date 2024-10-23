package ar.edu.unq.po2.tpObserver.ej1;

public class CriterioPorAutor implements CriterioDeSuscripcion {
	
	private String autor;
	
	public CriterioPorAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public boolean cumpleConCriterio(Articulo articulo) {
		return articulo.getAutores().contains(autor);
	}

}
