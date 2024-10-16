package ar.edu.unq.po2.tpComposite.ej5;

public class Product {
	
	private float price;
	private String name;
	
	public Product(String name, float price){
		this.price = price;
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
