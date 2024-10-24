package ar.edu.unq.po2.tpObserver.ej3;

public class Respuesta {
	
	private Jugador jugador;
	private String respuesta;
	
	public Respuesta(Jugador jugador, String respuesta) {
		this.jugador = jugador;
		this.respuesta = StringUtils.formatString(respuesta);
	}

	public Jugador getJugador() {
		return jugador;
	}

	public String getRespuesta() {
		return respuesta;
	}

}
