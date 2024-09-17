package ar.edu.unq.po2.tpSOLID.caso1;

public class Correo implements ICorreo {

	private String asunto;
	private String destinatario;
	private String cuerpo;

	public Correo(String asunto, String destinatario, String cuerpo) {
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}

	@Override
	public String getAsunto() {
		return asunto;
	}

	@Override
	public String getDestinatario() {
		return destinatario;
	}

	@Override
	public String getCuerpo() {
		return cuerpo;
	}

}
