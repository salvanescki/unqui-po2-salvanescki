package ar.edu.unq.po2.tp3.ej11;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombre;
	private List<Persona> integrantes = new ArrayList<Persona>();

	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
	}
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	
	public void agregarIntegrante(Persona persona) {
		integrantes.add(persona);
	}
	
	public String nombre() {
		return this.nombre;
	}
	
	public int promedioEdadIntegrantes() {
		return integrantes.stream().mapToInt(p -> p.edad()).sum() / integrantes.size();
	}
}
