package ar.edu.unq.po2.tpSOLID.caso1;

import java.util.ArrayList;
import java.util.List;

public class EmailManager implements IEmailManager{
	
	private List<ICorreo> inbox = new ArrayList<ICorreo>();
	private List<ICorreo> borrados = new ArrayList<ICorreo>();
	
	@Override
	public void agregarCorreo(List<ICorreo> nuevosCorreos) {
		inbox.addAll(nuevosCorreos);
	}

	@Override
	public void borrarCorreo(ICorreo correo) {
		inbox.remove(correo);
		borrados.add(correo);
	}

	@Override
	public int contarBorrados() {
		return borrados.size();
	}

	@Override
	public int contarInbox() {
		return inbox.size();
	}

	@Override
	public void eliminarBorrado(ICorreo correo) {
		borrados.remove(correo);
	}

}
