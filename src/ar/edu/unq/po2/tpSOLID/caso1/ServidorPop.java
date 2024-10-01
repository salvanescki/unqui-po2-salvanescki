package ar.edu.unq.po2.tpSOLID.caso1;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IConnectableServidorPop {

	@Override
	public void conectar(IUsuario usuario) {
		// Verifica que el usuario sea valido y establece la conexion.
	}

	@Override
	public List<ICorreo> recibirNuevos(IUsuario usuario) {
		List<ICorreo> retorno = new ArrayList<ICorreo>();
		// Verificar autenticidad de usuario.
		// obtener emails Nuevos del usuario.
		// asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	@Override
	public void enviar(ICorreo correo) {
		// realiza lo necesario para enviar el correo.
	}

}
