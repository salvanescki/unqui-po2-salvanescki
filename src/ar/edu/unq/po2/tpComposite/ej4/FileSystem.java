package ar.edu.unq.po2.tpComposite.ej4;

public interface FileSystem {

	/**
	 * Retorna el total ocupado en disco del receptor. Expresado en cantidad de
	 * bytes.
	 */
	public int totalSize();

	/**
	 * Imprime en consola el contenido indicando el nombre del elemento
	 * e indentandolo con tantos espacios como profundidad en la estructura.
	 */
	public void printStructure();

	/**
	 * Elemento mas nuevo
	 */
	public File lastModified();

	/**
	 * Elemento mas antiguo
	 */
	public File oldestElement();
	
	/**
	 * Agrega un subdirectorio o archivo al actual directorio
	 */
	public void add(FileSystem element);
	
	/**
	 * Elimina un subdirectorio o archivo del actual directorio
	 */
	public void remove(FileSystem element);
	
	/**
	 * Devuelve el elemento número index
	 */
	public FileSystem get(int index);

}
