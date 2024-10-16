package ar.edu.unq.po2.tpComposite.ej6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeShifterNode implements IShapeShifter {
	
	private int value;
	
	public ShapeShifterNode(int value) {
		this.value = value;
	}

	@Override
	public IShapeShifter compose(IShapeShifter component) {
		return new ShapeShifterComposite(new ArrayList<IShapeShifter>(Arrays.asList(this, component)));
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		return new ArrayList<Integer>(Arrays.asList(value));
	}

}
