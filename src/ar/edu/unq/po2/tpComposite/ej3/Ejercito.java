package ar.edu.unq.po2.tpComposite.ej3;
import ar.edu.unq.po2.tp3.geometry.Point;

public abstract class Ejercito {
	
	protected Point posActual = new Point(0, 0);
	
	public void moverA(Point destino, Mapa mapa) {
		posActual = destino;
	}
	public abstract void agregar(Ejercito unEjercito);
	public abstract void remover(Ejercito unEjercito);
	public abstract Ejercito getEjercito(int index);
	
}
