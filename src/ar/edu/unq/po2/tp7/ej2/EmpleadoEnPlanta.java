package ar.edu.unq.po2.tp7.ej2;

public class EmpleadoEnPlanta extends Empleado{
	
	private int cantHijos = 0;

	public EmpleadoEnPlanta(int cantHorasTrabajadas, int cantHijos) {
		super(cantHorasTrabajadas);
		this.cantHijos = cantHijos;
	}
	
	@Override
	protected float salarioBasico() {
		return 3000;
	}
	
	@Override
	protected float extraFamiliar() {
		return 150 * cantHijos;
	}


}
