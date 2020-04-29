package by.htp.basicOOP.task5.bean;

public class Sweet {
	
	private String name;
	

	public Sweet(String name) {
		
		this.name = name;
	
	}
	

	@Override
	public String toString() {
		return "Sweet [name=" + name + ", cost=" + "]";
	}


	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
