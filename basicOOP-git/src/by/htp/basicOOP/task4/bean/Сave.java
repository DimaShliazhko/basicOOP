package by.htp.basicOOP.task4.bean;

import java.util.ArrayList;

public class Ñave {

	private String name;
	ArrayList<Treasure> treasure = new ArrayList<Treasure>();
	private boolean dragon;

	public Ñave() {

	}

	public Ñave(String name, ArrayList<Treasure> treasure, boolean dragon) {

		this.name = name;
		this.treasure = treasure;
		this.dragon = dragon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Treasure> getTreasure() {
		return treasure;
	}

	public void setTreasure(ArrayList<Treasure> treasure) {
		this.treasure = treasure;
	}
	public void setTreasure(Treasure treasure) {
		this.treasure.add(treasure);
	}

	public boolean isDragon() {
		return dragon;
	}

	public void setDragon(boolean dragon) {
		this.dragon = dragon;
	}

	@Override
	public String toString() {
		return "Ñave [name=" + name + ", treasure=" + treasure + ", dragon=" + dragon + "]";
	}

}
