package ar.edu.unq.po2.tpSOLID.banco;

public class Cliente extends Persona implements Pagable, Remunerable {

	private long sueldoNetoMensual;
	private long ahorros = 0;

	public Cliente(String nombre, String apellido, String dirección, int edad, long sueldo) {
		super(nombre, apellido, dirección, edad);
		this.sueldoNetoMensual = sueldo;
	}

	public long getAhorros() {
		return ahorros;
	}

	@Override
	public long ingresosMensuales() {
		return sueldoNetoMensual;
	}

	@Override
	public long ingresosAnuales() {
		return sueldoNetoMensual * 12;
	}

	@Override
	public void recibirPago(long pago) {
		ahorros += pago;
	}
	
	public void debitar(long monto) {
		ahorros -= monto;
	}

}
