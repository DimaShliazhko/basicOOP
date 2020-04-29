package by.htp.basicOOP.task1.bean;

public class File {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File() {
	}

	public File(String name) {

		this.name = name;

	}

	@Override
	public String toString() {
		return getClass().getName() + " [name=" + name + "]";
	}

}
