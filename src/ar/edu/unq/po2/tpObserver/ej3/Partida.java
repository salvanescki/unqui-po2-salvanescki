package ar.edu.unq.po2.tpObserver.ej3;

import java.util.List;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class Partida extends Observable {
	
	private Servidor servidor;
	private List<Pregunta> preguntas;
	private List<Jugador> jugadores;
	private List<Pregunta> preguntasQueFaltanContestar;
	
	public Partida(Servidor servidor, List<Pregunta> preguntas, List<Jugador> jugadores) {
		this.servidor = servidor;
		this.preguntas = preguntas;
		this.jugadores = jugadores;
		this.preguntasQueFaltanContestar = preguntas;
	}
	
	private void notificarInicioPartida() {
		jugadores.forEach(jugador -> {
			jugador.reset();
			jugador.setPreguntas(preguntas);
			jugador.update(this, "La partida ha comenzado.");
		});
	}
	
	private void notificarJugadorRespuesta(Jugador jugador, String resultado) {
		jugador.update(this, resultado);
	}
	
	private void notificarJugadoresQueSeRespondioCorrectamente(Jugador jugador, Pregunta pregunta) {
		jugadores.forEach(j -> j.update(this, "El jugador: " + jugador.getNombre() + " respondió correctamente a la pregunta: " + pregunta.getEnunciado() + "."));
	}
	
	private void notificarFinPartida(Jugador ganador) {
		jugadores.forEach(j -> j.update(this, "El ganador es: " + ganador.getNombre() + " respondió correctamente " + Integer.toString(ganador.getCantRespuestasCorrectas()) + " preguntas."));
	}
	
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public void iniciar() {
		this.notificarInicioPartida();
	}
	
	private void validarPregunta(Pregunta pregunta) {
		if(!preguntas.contains(pregunta)) {
			throw new PreguntaInvalidaException("La pregunta no es válida o no pertenece a esta partida");
		}
	}
	
	private void validarRespuesta(Respuesta respuesta, Pregunta pregunta) {
		if(pregunta.esCorrecta(respuesta)) {
			notificarJugadorRespuesta(respuesta.getJugador(), "respuesta incorrecta");
		}
		notificarJugadorRespuesta(respuesta.getJugador(), "respuesta correcta");
		respuesta.getJugador().incrementarRespuestasCorrectas();
		notificarJugadoresQueSeRespondioCorrectamente(respuesta.getJugador(), pregunta);
		preguntasQueFaltanContestar.remove(pregunta);
		if(preguntasQueFaltanContestar.isEmpty()) {
			this.finalizar();
			servidor.siguientePartida();
		}
	}
	
	private void finalizar() {
		this.notificarFinPartida(jugadores.stream()
										  .max((j1, j2) -> Integer.compare(j1.getCantRespuestasCorrectas(), j2.getCantRespuestasCorrectas()))
										  .orElseThrow(() -> new RuntimeException("La lista de jugadores está vacía")));
	}

	public void recibirRespuesta(Respuesta respuesta, Pregunta pregunta) {
		this.validarPregunta(pregunta);
		this.validarRespuesta(respuesta, pregunta);
	}

}
