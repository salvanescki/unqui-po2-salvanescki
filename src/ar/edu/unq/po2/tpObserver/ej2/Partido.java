package ar.edu.unq.po2.tpObserver.ej2;

import java.util.List;

public class Partido {

	private String resultado;
	private List<String> contrincantes;
	private String deporte;
	
	public Partido(String resultado, List<String> contrincantes, String deporte) {
		this.resultado = resultado;
		this.contrincantes = contrincantes.stream()
										  .map(str -> formatString(str))
										  .toList();
		this.deporte = formatString(deporte);
	}
	
	private String formatString(String str) {
		return str.toLowerCase().replace(" ", "");
	}

	public String getResultado() {
		return resultado;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}

	public String getDeporte() {
		return deporte;
	}
	
}
