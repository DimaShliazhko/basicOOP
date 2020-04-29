package by.htp.basicOOP.task5.bean;

public class Packing {

	private String material;
	
	public Packing(String material) {
		super();
		this.material = material;
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	

	@Override
	public String toString() {
		return "Packing [material=" + material +"]";
	}

}
