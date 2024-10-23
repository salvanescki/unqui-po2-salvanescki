package ar.edu.unq.po2.tpObserver.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Aplicacion extends Observable {
	
	private List<Suscriptor> suscriptores = new ArrayList<Suscriptor>();
	private List<Partido> partidos = new ArrayList<Partido>();

	private void notificar(Partido partido) {
		suscriptores.stream()
					.filter(sub -> sub.getDeportesSuscriptos().contains(partido.getDeporte()) 
								|| sub.getCompetidoresSuscriptos().stream()
																  .anyMatch(partido.getContrincantes()::contains))
					.forEach(sub -> sub.update(this, partido.getResultado()));
		
//		for(Suscriptor sub : suscriptores) {
//			for(String deporte : sub.getDeportesSuscriptos()) {
//				if(deporte.equals(partido.getDeporte())) {
//					
//				}
//			}
//		}
	}
	
	public void agregarPartido(Partido partido) {
		partidos.add(partido);
		this.notificar(partido);
	}
	
	public void agregarSuscriptor(Suscriptor sub) {
		suscriptores.add(sub);
	}
	
	public void eliminarSuscriptor(Suscriptor sub) {
		suscriptores.remove(sub);
	}
}
