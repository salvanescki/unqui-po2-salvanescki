package ar.edu.unq.po2.tpSOLID.caso1;

public class ClienteEMail {

	private IConnectableServidorPop servidor;
	private IUsuario usuario;
	private IEmailManager emailManager;

	public ClienteEMail(IConnectableServidorPop servidor, IUsuario usuario, IEmailManager emailManager) {
		this.servidor = servidor;
		this.usuario = usuario;
		this.emailManager = emailManager;
		this.servidor.conectar(usuario);
	}

	public void borrarCorreo(ICorreo correo) {
		emailManager.borrarCorreo(correo);
	}

	public int contarBorrados() {
		return emailManager.contarBorrados();
	}

	public int contarInbox() {
		return emailManager.contarInbox();
	}

	public void eliminarBorrado(ICorreo correo) {
		emailManager.eliminarBorrado(correo);
	}

	public void recibirNuevos() {
		emailManager.agregarCorreo(servidor.recibirNuevos(usuario));
	}

	public void enviarCorreo(ICorreo correo) {
		servidor.enviar(correo);
	}

}
