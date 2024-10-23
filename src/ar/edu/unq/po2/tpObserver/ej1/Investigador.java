package ar.edu.unq.po2.tpObserver.ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Investigador implements Observer {
	private List<CriterioDeSuscripcion> criterios = new ArrayList<CriterioDeSuscripcion>();
	private List<String> notificaciones = new ArrayList<String>();
	
	public void publicar(Articulo articulo, SistemaDePublicaciones sistema) {
		sistema.agregarArticulo(articulo);
	}
	
	public void suscribir(CriterioDeSuscripcion criterio, SistemaDePublicaciones sistema) {
		criterios.add(criterio);
		sistema.agregarSuscriptor(this);
	}
	
	public List<CriterioDeSuscripcion> getCriterios(){
		return criterios;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg == null) return;
		String notificacion = (String) arg;
		notificaciones.add(notificacion);
	}
	
	public List<String> getNotificaciones(){
		return notificaciones;
	}
	
}
