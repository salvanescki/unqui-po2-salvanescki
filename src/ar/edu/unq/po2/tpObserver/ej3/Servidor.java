package ar.edu.unq.po2.tpObserver.ej3;

public class Servidor {
	
	private Partida partidaActual;
	private Partida partidaSiguiente;
	
	public Servidor(Partida partidaInicial) {
		this.partidaActual = null;
		this.partidaSiguiente = partidaInicial;
	}
	
	public void siguientePartida() {
		if (partidaSiguiente == null) { 
			throw new RuntimeException("No hay una siguiente partida.");
		}
		partidaActual = partidaSiguiente;
		partidaActual.iniciar();
	}
	
	public void agregarPartida(Partida partida) {
		partidaSiguiente = partida;
	}
	
	public void participarEnSiguientePartida(Jugador jugador) {
		if (partidaSiguiente == null) { 
			throw new RuntimeException("No hay una siguiente partida.");
		}
		partidaSiguiente.agregarJugador(jugador);
	}
	
	public void recibirRespuesta(Respuesta respuesta, Pregunta pregunta) {
		partidaActual.recibirRespuesta(respuesta, pregunta);
	}
}
