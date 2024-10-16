package ar.edu.unq.po2.tpComposite.ej4;

import java.util.Date;

public class File implements FileSystem, Comparable<File> {

	private String name;
	private Date lastModified;
	private int size;
	
	public File(String name, int size) {
		this.name = name;
		this.lastModified = new Date();
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public Date getLastModified() {
		return lastModified;
	}

	@Override
	public int totalSize() {
		return size;
	}

	@Override
	public void printStructure() {
		System.out.print(name + " ");
	}

	@Override
	public File lastModified() {
		return this;
	}

	@Override
	public File oldestElement() {
		return this;
	}

	@Override
	public int compareTo(File f) {
		 return (this.getLastModified().before(f.getLastModified())) ? -1 : ((this.getLastModified().after(f.getLastModified())) ? 1 : 0);
	}

	@Override
	public void add(FileSystem element) {}

	@Override
	public void remove(FileSystem element) {}

	@Override
	public FileSystem get(int index) {
		return null;
	}

}
