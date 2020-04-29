package by.htp.basicOOP.task5.bean;

import java.util.ArrayList;

public class Gift {

	private String name;
	ArrayList<Sweet> sweets = new ArrayList<Sweet>();
	private Packing newpackage;
	private int cost;

	public Gift() {
	}

	public Gift(String name, ArrayList<Sweet> sweets, Packing newpackage, int cost) {
		super();
		this.name = name;
		this.sweets = sweets;
		this.newpackage = newpackage;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Gift [name=" + name + ", sweets=" + sweets + ", newpackage=" + newpackage + ", cost=" + cost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Sweet> getSweets() {
		return sweets;
	}

	public void setSweets(ArrayList<Sweet> sweets) {
		this.sweets = sweets;
	}

	public void setSweets(Sweet sweets) {
		this.sweets.add(sweets);
	}

	public Packing getNewpackage() {
		return newpackage;
	}

	public void setNewpackage(Packing newpackage) {
		this.newpackage = newpackage;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
	
		this.cost = cost ;
	}

}
