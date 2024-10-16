package ar.edu.unq.po2.tpComposite.ej6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifterTest {
	
	private IShapeShifter root;
	private IShapeShifter leaf;

	@BeforeEach
	void setUp() throws Exception {
		leaf = new ShapeShifterNode(1);
		
		root = leaf.compose(new ShapeShifterNode(2))
				   .compose(new ShapeShifterNode(3))
				   .compose(new ShapeShifterNode(4))
				   .compose(new ShapeShifterNode(5))
				   .compose(new ShapeShifterNode(6))
				   .compose(new ShapeShifterNode(7));
		
		
	}

	@Test
	void deepestTest() {
		assertEquals(6, root.deepest());
	}
	
	@Test
	void flatTest() {
		IShapeShifter flattenedShifter = new ShapeShifterComposite(List.of(new ShapeShifterNode(1),
																		   new ShapeShifterNode(2),
																		   new ShapeShifterNode(3),
																		   new ShapeShifterNode(4),
																		   new ShapeShifterNode(5),
																		   new ShapeShifterNode(6),
																		   new ShapeShifterNode(7)
																		  ));
		Assertions.assertIterableEquals(flattenedShifter.values(), root.flat().values());
	}
	
	@Test
	void valuesTest() {
		assertEquals(List.of(1,2,3,4,5,6,7), root.values());
	}
	

}
