package ar.edu.unq.po2.tp5.caja2;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Pagable{
	private List<Pagable> importes = new ArrayList<Pagable>();
	
	public void registrarImporte(Pagable importe) {
		importes.add(importe);
	}
	
	public void registrarImporte(Pagable importe, int cantidad) {
		for(int i = 0; i < cantidad; i++) {
			importes.add(importe);
		}
	}
	
	@Override
	public int montoAPagar() {
		return importes.stream().mapToInt(n -> n.montoAPagar()).sum();
	}

	@Override
	public void procesarPago() {
		importes.forEach(n -> n.procesarPago());
	}

}
