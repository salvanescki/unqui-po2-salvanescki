package ar.edu.unq.po2.tpComposite.ej3;

import java.util.List;

import ar.edu.unq.po2.tp3.geometry.Point;

public class Ingeniero extends Ejercito {
	
	private int lajasDisponibles;
	
	public Ingeniero(int cantLajas){
		lajasDisponibles = cantLajas;
	}
	
	@Override
	public void moverA(Point destino, Mapa mapa) {
		List<Point> camino = mapa.calcularCaminoMasCorto(this.posActual, destino);
		for (Point paso : camino) {
			if(!mapa.hayLajaEnPosicion(paso) && lajasDisponibles > 0) {
				mapa.colocarLaja(paso);
				lajasDisponibles--;
			}
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
