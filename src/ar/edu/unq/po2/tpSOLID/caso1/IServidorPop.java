package ar.edu.unq.po2.tpSOLID.caso1;

import java.util.List;

public interface IServidorPop {
	public List<ICorreo> recibirNuevos(IUsuario usuario);

	public void enviar(ICorreo correo);
}
