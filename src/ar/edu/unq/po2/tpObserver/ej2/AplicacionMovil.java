package ar.edu.unq.po2.tpObserver.ej2;

public class AplicacionMovil extends Suscriptor {
	
	public void suscribirCompetidor(String competidor) {
		this.getCompetidoresSuscriptos().add(formatString(competidor));
	}
	
	public void desuscribirCompetidor(String competidor) {
		this.getCompetidoresSuscriptos().remove(formatString(competidor));
	}

}
