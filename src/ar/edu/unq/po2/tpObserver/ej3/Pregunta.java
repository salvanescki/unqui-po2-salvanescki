package ar.edu.unq.po2.tpObserver.ej3;

public class Pregunta {
	
	private String enunciado;
	private String respuestaCorrecta;
	
	public Pregunta(String enunciado, String respuestaCorrecta) {
		this.enunciado = enunciado;
		this.respuestaCorrecta = StringUtils.formatString(respuestaCorrecta);
	}

	public String getEnunciado() {
		return enunciado;
	}

	public boolean esCorrecta(Respuesta respuesta) {
		return respuesta.getRespuesta().equals(respuestaCorrecta);
	}

}
