package ar.edu.unq.po2.tpComposite.ej3;


import java.util.List;

import ar.edu.unq.po2.tp3.geometry.Point;

public class Caballero extends Ejercito {

	@Override
	public void moverA(Point destino, Mapa mapa) {
		List<Point> camino = mapa.calcularCaminoEnZigzag(this.posActual, destino);
		for (Point paso : camino) {
			this.posActual = paso;
		}
	}

	@Override
	public void agregar(Ejercito unEjercito) {}

	@Override
	public void remover(Ejercito unEjercito) {}

	@Override
	public Ejercito getEjercito(int index) {
		return this;
	}
	
}
