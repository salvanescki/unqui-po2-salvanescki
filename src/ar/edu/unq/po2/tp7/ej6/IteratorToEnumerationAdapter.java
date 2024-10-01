package ar.edu.unq.po2.tp7.ej6;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumerationAdapter<E> implements Enumeration<E>{
	
	private final Iterator<E> iteratorAdaptee;
	
	public IteratorToEnumerationAdapter(Iterator<E> iterator) {
		this.iteratorAdaptee = iterator;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iteratorAdaptee.hasNext();
	}
	
	@Override
	public E nextElement() {
		return iteratorAdaptee.next();
	}

}
