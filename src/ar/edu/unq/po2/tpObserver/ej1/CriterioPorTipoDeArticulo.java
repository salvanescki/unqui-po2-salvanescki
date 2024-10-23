package ar.edu.unq.po2.tpObserver.ej1;

public class CriterioPorTipoDeArticulo implements CriterioDeSuscripcion {
	
	private TipoDeArticulo tipoDeArticulo;
	
	public CriterioPorTipoDeArticulo(TipoDeArticulo tipoDeArticulo) {
		this.tipoDeArticulo = tipoDeArticulo;
	}

	@Override
	public boolean cumpleConCriterio(Articulo articulo) {
		return articulo.getTipoDeArticulo().equals(tipoDeArticulo);
	}

}
