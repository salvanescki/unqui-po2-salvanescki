package ar.edu.unq.po2.tpSOLID.caso1;

import java.util.List;

public interface IEmailManager {
	
	public void agregarCorreo(List<ICorreo> nuevosCorreos);
	
	public void borrarCorreo(ICorreo correo);

	public int contarBorrados();

	public int contarInbox();

	public void eliminarBorrado(ICorreo correo);
}
