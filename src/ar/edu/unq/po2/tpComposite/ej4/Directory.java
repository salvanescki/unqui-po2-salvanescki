package ar.edu.unq.po2.tpComposite.ej4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Directory implements FileSystem {
	
	private String name;
	private Date creationDate;
	private List<FileSystem> content;
	
	public Directory(String name) {
		this.name = name;
		this.creationDate = new Date();
		this.content = new ArrayList<FileSystem>();
	}
	
	public Directory(String name, List<FileSystem> files) {
		this.name = name;
		this.creationDate = new Date();
		this.content = files;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	
	public List<FileSystem> getContent(){
		return content;
	}

	@Override
	public int totalSize() {
		return content.stream()
					  .mapToInt(fs -> fs.totalSize())
					  .sum();
	}

	@Override
	public void printStructure() {
		System.out.print(name + "> ");
		content.forEach(fs -> fs.printStructure());
		System.out.print('\n');
	}

	@Override
	public File lastModified() {
		return content.stream()
					  .map(FileSystem::lastModified)
					  .filter(Objects::nonNull)
					  .max(Comparator.comparing(File::getLastModified))
					  .orElse(null);
	}

	@Override
	public File oldestElement() {
		return content.stream()
			  		  .map(FileSystem::lastModified)
					  .filter(Objects::nonNull)
					  .min(Comparator.comparing(File::getLastModified))
					  .orElse(null);
	}
	
	@Override
	public void add(FileSystem element) {
		content.add(element);
	}
	
	@Override
	public void remove(FileSystem element) {
		content.remove(element);
	}
	
	@Override
	public FileSystem get(int index) {
		return content.get(index);
	}

}
