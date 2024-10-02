package ar.edu.unq.po2.tp8.ej1;

public enum ColorLesionDermatologica {

	ROJO("Lesión en estado de inflamación"),
	GRIS("Lesión cicatrizando"),
	AMARILLO("Lesion recuperándose"),
	MIEL("Lesión casi completamente curada");
	
	private final String descripcion;
	
	ColorLesionDermatologica(String descripcion){
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public ColorLesionDermatologica proximoColor() {
		return values()[(this.ordinal() + 1) % values().length];
	}
}
