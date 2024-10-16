package ar.edu.unq.po2.tpComposite.ej6;

import java.util.List;

public interface IShapeShifter {
	/**
	 * Este método recibe un IShapeShifter y retorna un nuevo IShapeShifter que es el
	 * resultado de componer al receptor con el que es enviado como parámetro.
	 * La composición se realiza al mismo nivel de profundidad.
	 * En la figura se muestran esquemas de IShapeShifter, cada letra sibolizaria un nombre de variable.
	 * Entonces las siguientes expresiones deberían ser verdaderas:
	 * 	a.compose(b) es igual a c
	 * 	d.compose(c) es igual a d
	 * 	d.compose(e) es igual a f.
	 * @param component
	 * @return IShapeShifter
	 */
	public IShapeShifter compose(IShapeShifter component);
	
	/**
	 * Retorna un numero que representa la profundidad máxima alcanzada en
	 * composiciones que contiene. Continuando con las figuras de ejemplo, las
	 * siguienes expresiones deben ser validas.
	 * 	a.deepest() es igual a 0.
	 * 	c.deepest() es igual a 1.
	 * 	f.deepest() es igual a 3. 
	 * @return int
	 */
	public int deepest();
	
	/**
	 * Achata un IShapeShifter. Si el IShapeShifter posee una prfundidad maxima >= 1,
	 * entonces retorna un IShapeShifter de profundidad maxima 1 con todos los
	 * IShapeShifter de profundidad 0 contenidos. En cualquier otro caso, retorna el
	 * mismo IShapeShifter. Siguiendo los ejemplos
	 * 	a.flat() es igual a a.
	 * 	f.flat() es igual a g.
	 * @return IShapeShifter
	 */
	public IShapeShifter flat();
	
	/**
	 * Retorna una lista de enteros con los valores incluidos en el IShapeShifter.
	 * Siguiendo el ejemplo,
	 * a.values retorna una lista con el entero 1.
	 * d.values retorna una lista con los enteros 3,1 y 2.
	 * @return List<Integer>
	 */
	public List<Integer> values();
}
