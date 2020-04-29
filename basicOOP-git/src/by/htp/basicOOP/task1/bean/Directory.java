package by.htp.basicOOP.task1.bean;

import java.util.ArrayList;

public class Directory {
	private String name;
	private ArrayList<File> files = new ArrayList<File>();

	public Directory(String name) {

		this.name = name;
	}

	public Directory(String name, ArrayList<File> files) {

		this.name = name;
		this.files = files;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<File> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<File> files) {
		this.files = files;
	}

	public void setFiles(File files) {
		this.files.add(files);
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + ", files=" + files + "]";
	}

}
