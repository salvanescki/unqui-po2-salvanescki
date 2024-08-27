package ar.edu.unq.po2.tp3;

public class Rectángulo {
	
	private Point verticeInferiorIzquierdo;
	private Point verticeInferiorDerecho;
	private Point verticeSuperiorIzquierdo;
	private Point verticeSuperiorDerecho;
	
	public Rectángulo(Point puntoOrigen, int ancho, int altura) {
		this.verticeInferiorIzquierdo = puntoOrigen;
		this.verticeInferiorDerecho = puntoOrigen.add(new Point(ancho, 0));
		this.verticeSuperiorIzquierdo = puntoOrigen.add(new Point(0, altura));
		this.verticeSuperiorDerecho = puntoOrigen.add(new Point(ancho, altura));
	}
	
	public int ancho() {
		return this.verticeInferiorDerecho.x() - this.verticeInferiorIzquierdo.x();
	}
	
	public int altura() {
		return this.verticeSuperiorIzquierdo.y() - this.verticeInferiorIzquierdo.y();
	}
	
	public int area() {
		return this.ancho() * this.altura();
	}
	
	public int perimetro() {
		return 2 * this.ancho() + 2 * this.altura();
	}
	
	public boolean esHorizontal() {
		return this.ancho() > this.altura();
	}
	
}
