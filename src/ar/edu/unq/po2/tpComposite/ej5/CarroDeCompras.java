package ar.edu.unq.po2.tpComposite.ej5;

import java.util.List;

public class CarroDeCompras {
	
	private List<Product> products;
	
	@SuppressWarnings("unused")
	private void setElements(List<Product> products) {
		this.products.addAll(products);
	}
	
	public List<Product> getElements(){
		return products;
	}
	
	public int totalRounded() {
		return Math.round(this.total());
	}
	
	public float total() {
		return (float) products.stream()
					   		   .mapToDouble(Product::getPrice)
					   		   .sum();
	}

}
