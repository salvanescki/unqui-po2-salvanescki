package ar.edu.unq.po2.tp7.ej2;

public abstract class Empleado {
	private int cantHorasTrabajadas;
	
	public Empleado(int cantHorasTrabajadas) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}
	
	public float sueldo() {
		float sueldoBruto = this.salarioBasico() + this.sueldoPorHora() * cantHorasTrabajadas + this.extraFamiliar();
		
		return sueldoBruto - this.descuentoAportes(sueldoBruto);
	}
	
	public float descuentoAportes(float sueldoBruto) {
		return sueldoBruto * 0.13f;
	}
	
	protected float salarioBasico() {
		return 0;
	}
	
	protected float sueldoPorHora() {
		return 0;
	}
	
	protected float extraFamiliar() {
		return 0;
	}
}
