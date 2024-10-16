package ar.edu.unq.po2.tpComposite.ej5;

public class SpecialProduct extends Product {

	public SpecialProduct(String name, float price) {
		super(name, price);
	}
	
	@Override
	public float getPrice() {
		return super.getPrice() * 0.5f;
	}

}
