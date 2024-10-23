package ar.edu.unq.po2.tpObserver.ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class SistemaDePublicaciones extends Observable {
	
	private List<Investigador> suscriptores = new ArrayList<Investigador>();
	private List<Articulo> articulos = new ArrayList<Articulo>();

	private void notificarSuscriptores(Articulo articulo) {
		suscriptores.stream()
					.filter(sub -> sub.getCriterios().stream()
													 .anyMatch(crit -> crit.cumpleConCriterio(articulo)))
					.forEach(sub -> sub.update(this, "Se ha publicado el artículo " + articulo.getTitulo() + "."));
	}
	
	public void agregarArticulo(Articulo articulo) {
		articulos.add(articulo);
		this.notificarSuscriptores(articulo);
	}

	public void agregarSuscriptor(Investigador investigador) {
		suscriptores.add(investigador);
	}

}
