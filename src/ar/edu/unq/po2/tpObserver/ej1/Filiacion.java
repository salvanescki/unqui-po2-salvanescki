package ar.edu.unq.po2.tpObserver.ej1;

public class Filiacion {
	
	private String nombre;
	
	public Filiacion(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this) return true;
		if(other == null || getClass() != other.getClass()) return false;
		Filiacion o = (Filiacion) other;
		return nombre.equals(o.getNombre());
	}

}
