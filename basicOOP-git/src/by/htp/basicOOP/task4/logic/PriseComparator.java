package by.htp.basicOOP.task4.logic;

import java.util.Comparator;

import by.htp.basicOOP.task4.bean.Treasure;

public class PriseComparator implements Comparator<Treasure> {

	@Override
	public int compare(Treasure o1, Treasure o2) {
		if (o1.getCost() == o2.getCost()) {
			return 0;
		}
		if (o1.getCost() > o2.getCost()) {
			return 1;
		} else {
			return -1;
		}
	}
	/*
	 * if (h1.price == h2.price) { return 0; } if (h1.price > h2.price) { return 1;
	 * } else { return -1; }
	 * 
	 */
}
