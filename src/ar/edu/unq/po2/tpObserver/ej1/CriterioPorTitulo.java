package ar.edu.unq.po2.tpObserver.ej1;

public class CriterioPorTitulo implements CriterioDeSuscripcion {
	
	private String titulo;
	
	public CriterioPorTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean cumpleConCriterio(Articulo articulo) {
		return articulo.getTitulo().equals(titulo);
	}

}
