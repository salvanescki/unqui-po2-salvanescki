package ar.edu.unq.po2.tp7.ej2;

public class EmpleadoPasante extends Empleado{

	public EmpleadoPasante(int cantHorasTrabajadas) {
		super(cantHorasTrabajadas);
	}
	
	@Override
	protected float sueldoPorHora() {
		return 40;
	}

}
