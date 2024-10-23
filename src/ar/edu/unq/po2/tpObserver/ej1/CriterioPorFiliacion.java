package ar.edu.unq.po2.tpObserver.ej1;

public class CriterioPorFiliacion implements CriterioDeSuscripcion {
	
	private Filiacion filiacion;
	
	public CriterioPorFiliacion(Filiacion filiacion) {
		this.filiacion = filiacion;
	}

	@Override
	public boolean cumpleConCriterio(Articulo articulo) {
		return articulo.getFiliaciones().contains(filiacion);
	}

}
