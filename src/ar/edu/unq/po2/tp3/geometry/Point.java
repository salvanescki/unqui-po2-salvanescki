package ar.edu.unq.po2.tp3.geometry;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveTo(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	
	public Point add(Point other) {
		return new Point(this.x + other.x, this.y + other.y);
	}
	
	public int x() {
		return this.x;
	}
	
	public int y() {
		return this.y;
	}
}
