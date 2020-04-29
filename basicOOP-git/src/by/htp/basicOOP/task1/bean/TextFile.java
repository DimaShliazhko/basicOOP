package by.htp.basicOOP.task1.bean;

public class TextFile extends File {
	private String type;

	public TextFile() {
		super();
	}

	public TextFile(String name, String type) {
		super(name);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.getName() + " " + "TextFile [type=" + type + "]";
	}

}
