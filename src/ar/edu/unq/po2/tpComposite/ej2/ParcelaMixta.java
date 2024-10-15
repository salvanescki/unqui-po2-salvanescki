package ar.edu.unq.po2.tpComposite.ej2;

import java.util.List;

public class ParcelaMixta implements Parcela{
	
	private final List<Parcela> subdivisiones;

	public ParcelaMixta(Parcela parcelaSupIzq, Parcela parcelaSupDer, Parcela parcelaInfIzq, Parcela parcelaInfDer) {
		// Hago la lista inmutable utilizando el método List.of()
		subdivisiones = List.of(parcelaSupIzq, parcelaSupDer, parcelaInfIzq, parcelaInfDer);
	}
	
	@Override
	public int ganancia() {
		return subdivisiones.stream()
							.mapToInt(parcela -> parcela.ganancia())
							.sum();
	}

}
