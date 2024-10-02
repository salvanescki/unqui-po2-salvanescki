package ar.edu.unq.po2.tp7.ej7;

import javax.swing.DefaultListModel;

@SuppressWarnings("serial")
public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String>{

	private ListaDePalabrasOrdenadas listaDePalabrasOrdenadas;
	
	public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas listaDePalabrasOrdenadas) {
		this.listaDePalabrasOrdenadas = listaDePalabrasOrdenadas;
	}
	
	@Override
	public void addElement(String element) {
		listaDePalabrasOrdenadas.agregarPalabra(element);
	}
	
	@Override
	public int getSize() {
        return listaDePalabrasOrdenadas.cantidadDePalabras();
    }
	
	@Override
	public String getElementAt(int index) {
		return listaDePalabrasOrdenadas.getPalabraDePosicion(index);
	}
}
