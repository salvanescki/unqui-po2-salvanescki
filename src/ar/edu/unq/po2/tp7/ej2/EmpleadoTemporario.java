package ar.edu.unq.po2.tp7.ej2;

public class EmpleadoTemporario extends Empleado{
	
	private boolean tieneFamilia = false;

	public EmpleadoTemporario(int cantHorasTrabajadas, boolean tieneFamilia) {
		super(cantHorasTrabajadas);
		this.tieneFamilia = tieneFamilia;
	}
	
	@Override
	protected float salarioBasico() {
		return 1000;
	}
	
	@Override
	protected float sueldoPorHora() {
		return 5;
	}
	
	@Override
	protected float extraFamiliar() {
		return tieneFamilia? 100 : 0;
	}

}
