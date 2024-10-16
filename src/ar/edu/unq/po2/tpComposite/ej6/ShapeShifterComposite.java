package ar.edu.unq.po2.tpComposite.ej6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeShifterComposite implements IShapeShifter {
	
	private final List<IShapeShifter> components = new ArrayList<IShapeShifter>();
	
	public ShapeShifterComposite() {}
	
	public ShapeShifterComposite(List<IShapeShifter> components){
		this.components.addAll(components);
	}
	
	public void addShapeShifter(IShapeShifter aShapeShifter) {
		components.add(aShapeShifter);
	}

	@Override
	public IShapeShifter compose(IShapeShifter component) {
		return new ShapeShifterComposite(new ArrayList<IShapeShifter>(Arrays.asList(this, component)));
	}

	@Override
	public int deepest() {
		return 1 + components.stream()
							 .mapToInt(IShapeShifter::deepest)
							 .max()
							 .orElse(0);
	}

	@Override
	public IShapeShifter flat() {
		return new ShapeShifterComposite(components.stream()
						 						   .flatMap(c -> c.values().stream())
						 						   .map(ShapeShifterNode::new)
						 						   .collect(Collectors.toList()));
	}

	@Override
	public List<Integer> values() {
		return components.stream()
						 .flatMap(c -> c.values().stream())
						 .toList();
	}

}
