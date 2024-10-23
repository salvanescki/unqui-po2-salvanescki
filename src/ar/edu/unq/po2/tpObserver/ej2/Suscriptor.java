package ar.edu.unq.po2.tpObserver.ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public abstract class Suscriptor implements Observer {
	
	private List<String> deportesSuscriptos = new ArrayList<String>();
	private List<String> competidoresSuscriptos = new ArrayList<String>();
	private List<String> notificaciones = new ArrayList<String>();
	
	protected String formatString(String str) {
		return str.toLowerCase().replace(" ", "");
	}
	
	public void suscribirDeporte(String deporte) {
		deportesSuscriptos.add(formatString(deporte));
	}
	
	public void desuscribirDeporte(String deporte) {
		deportesSuscriptos.remove(formatString(deporte));
	}
	
	public abstract void suscribirCompetidor(String competidor);
	
	public abstract void desuscribirCompetidor(String competidor);
	
	public List<String> getDeportesSuscriptos() {
		return deportesSuscriptos;
	}
	
	public List<String> getCompetidoresSuscriptos() {
		return competidoresSuscriptos;
	}
	
	public List<String> getNotificaciones() {
		return notificaciones;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg == null) return;
		notificaciones.add((String) arg);
	}

}
