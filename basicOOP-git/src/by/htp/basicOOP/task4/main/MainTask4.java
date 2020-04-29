package by.htp.basicOOP.task4.main;

import by.htp.basicOOP.task4.bean.Treasure;
import by.htp.basicOOP.task4.bean.Сave;
import by.htp.basicOOP.task4.logic.LogicTask4;
import by.htp.basicOOP.task4.logic.PriseComparator;
import by.htp.basicOOP.task4.view.ViewTask4;

public class MainTask4 {

	public static void main(String[] args) {
		ViewTask4 view = new ViewTask4();
		LogicTask4 logic = new LogicTask4();
		PriseComparator priseComparator = new PriseComparator();
		// cave.getTreasure().sort(priseComparator);

		Сave newCave = new Сave();
		newCave.setName("пещера дракона");
		newCave.setDragon(true);

		for (int i = 0; i < 100; i++) {

			int cost;
			cost = (int) ((Math.random() * 100)+1);
			Treasure treasure = new Treasure("treasure" + i, cost);
			newCave.setTreasure(treasure);
		}
		view.printTreasure(newCave);
		System.out.println();
		view.printTreasure(logic.mostExpensiveTreasure(newCave));
		System.out.println();
		view.printTreasure(logic.choiceTreasure(newCave));
	
	}

}
