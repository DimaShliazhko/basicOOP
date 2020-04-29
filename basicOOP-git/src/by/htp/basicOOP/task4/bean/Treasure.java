package by.htp.basicOOP.task4.bean;

public class Treasure {

	private String name;
	private int cost;

	public Treasure(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Treasure [name=" + name + ", cost=" + cost + "]";
	}

	
	
}
