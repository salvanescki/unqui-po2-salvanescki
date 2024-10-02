package ar.edu.unq.po2.tp8.ej2;

public class ActividadSemanal {
	
	private DiaDeLaSemana diaDeLaSemana;
	private int horaDeInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, int horaDeInicio, int duracion, Deporte deporte) {
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}
	
	public int getHoraDeInicio() {
		return horaDeInicio;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public int costoComplejidad() {
		return deporte.getComplejidad() * 200;
	}
	
	public int costoSegunDiaDeLaSemana() {
		return diaDeLaSemana.ordinal() < 3? 500 : 1000;
	}
	
	public int getCosto() {
		return this.costoSegunDiaDeLaSemana() + this.costoComplejidad();
	}
	
	@Override
	public String toString() {
	      return "Deporte: " + this.getDeporte()
	      		+ ". Dia: " + this.getDiaDeLaSemana()
      			+ " A LAS: " + this.getHoraDeInicio()
      			+ " . Duración: " + this.getDuracion()
      			+ " hora(s).";
	}
}
