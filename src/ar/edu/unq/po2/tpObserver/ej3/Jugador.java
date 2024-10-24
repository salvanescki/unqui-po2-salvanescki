package ar.edu.unq.po2.tpObserver.ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Jugador implements Observer {
	
	private String nombre;
	private int cantRespuestasCorrectas;
	private List<Pregunta> preguntas;
	private List<String> notificaciones;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.reset();
	}
	
	public void reset() {
		this.cantRespuestasCorrectas = 0;
		this.preguntas = new ArrayList<Pregunta>();
		this.notificaciones = new ArrayList<String>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCantRespuestasCorrectas() {
		return cantRespuestasCorrectas;
	}
	
	public void incrementarRespuestasCorrectas() {
		cantRespuestasCorrectas++;
	}

	@Override
	public void update(Observable o, Object arg) {
		notificaciones.add((String) arg);
	}

	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas.addAll(preguntas);
	}

}
