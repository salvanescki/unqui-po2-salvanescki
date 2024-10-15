package ar.edu.unq.po2.tpComposite.ej3;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp3.geometry.Point;

public class EjercitoComposite extends Ejercito {
	
	private List<Ejercito> ejercitos = new ArrayList<Ejercito>();
	
	@Override
	public void moverA(Point destino, Mapa mapa) {
		ejercitos.forEach(ejercito -> ejercito.moverA(destino, mapa));
		super.moverA(destino, mapa);
	}

	@Override
	public void agregar(Ejercito unEjercito) {
		ejercitos.add(unEjercito);
	}

	@Override
	public void remover(Ejercito unEjercito) {
		ejercitos.remove(unEjercito);
	}

	@Override
	public Ejercito getEjercito(int index) {
		return ejercitos.get(index);
	}

}
