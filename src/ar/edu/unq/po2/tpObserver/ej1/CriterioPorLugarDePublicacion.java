package ar.edu.unq.po2.tpObserver.ej1;

public class CriterioPorLugarDePublicacion implements CriterioDeSuscripcion {
	
	private Lugar lugarDePublicacion;
	
	public CriterioPorLugarDePublicacion(Lugar lugarDePublicacion) {
		this.lugarDePublicacion = lugarDePublicacion;
	}

	@Override
	public boolean cumpleConCriterio(Articulo articulo) {
		return articulo.getLugarDePublicacion().equals(lugarDePublicacion);
	}

}
