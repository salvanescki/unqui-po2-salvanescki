package ar.edu.unq.po2.tpComposite.ej4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FileSystemTest {
	
	private FileSystem root;
	private FileSystem bin;
	private FileSystem boot;
	private FileSystem etc;
	private FileSystem usr;
	private FileSystem var;
	private FileSystem sbin;
	private FileSystem tmp;
	private FileSystem dev;
	private FileSystem home;
	private FileSystem lib;
	private FileSystem mnt;
	private FileSystem opt;

	@BeforeEach
	void setUp() throws Exception {
		root = new Directory("root");
		bin = new Directory("bin", List.of(new File("cat", 20),
										   new File("chgrp", 30),
										   new File("chmod", 10),
										   new File("chown", 50),
										   new File("cp", 100),
										   new File("data", 400),
										   new File("dd", 20),
										   new File("mkdir", 150),
										   new File("mount", 600)
										  ));
		boot = new Directory("boot", List.of(new File("kernel", 40000),
										     new File("system.map", 400),
											 new File("vmlinuz", 3000),
											 new File("initrd", 30),
											 new File("grub", 1000),
											 new File("module.info", 100),
											 new File("boot", 300)
										  ));
		etc = new Directory("etc");
		usr = new Directory("usr", List.of(new Directory("local"),
										   new Directory("share", List.of(
												   new Directory("man", List.of(
														   		new File("userprograms", 20),
														   		new File("syscalls", 10),
														   		new File("libfuncs", 30),
														   		new File("specialfile", 4)
														   ))
												   )),
										   new Directory("bin"),
										   new Directory("include"),
										   new Directory("lib"),
										   new Directory("sbin")
									      ));
		var = new Directory("var");
		sbin = new Directory("sbin");
		tmp = new Directory("tmp");
		dev = new Directory("dev");
		home = new Directory("home");
		lib = new Directory("lib");
		mnt = new Directory("mnt");
		opt = new Directory("opt");
		
		root.add(bin);
		root.add(boot);
		root.add(etc);
		root.add(usr);
		root.add(var);
		root.add(sbin);
		root.add(tmp);
		root.add(dev);
		root.add(home);
		root.add(lib);
		root.add(mnt);
		root.add(opt);
	}

	@Test
	void totalSizeTest() {
		assertEquals(46274, root.totalSize());
	}
	
	@Test
	void printStructureTest() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
		root.printStructure();
		
		System.setOut(originalOut);
		
		assertEquals("root> bin> cat chgrp chmod chown cp data dd mkdir mount \n"
					+ "boot> kernel system.map vmlinuz initrd grub module.info boot \n"
					+ "etc> \n"
					+ "usr> local> \n"
					+ "share> man> userprograms syscalls libfuncs specialfile \n\n"
					+ "bin> \n"
					+ "include> \n"
					+ "lib> \n"
					+ "sbin> \n"
					+ "\n"
					+ "var> \n"
					+ "sbin> \n"
					+ "tmp> \n"
					+ "dev> \n"
					+ "home> \n"
					+ "lib> \n"
					+ "mnt> \n"
					+ "opt> \n"
					+ "\n", outContent.toString());
	}
	
	@Test
	void lastModifiedTest() {
		assertEquals("cat", root.lastModified().getName());
	}
	
	@Test
	void oldestElementTest() {
		assertEquals("cat", root.oldestElement().getName());
	}


}
