package by.htp.basicOOP.task4.logic;

import by.htp.basicOOP.task4.bean.Treasure;
import by.htp.basicOOP.task4.bean.Ñave;
import by.htp.basicOOP.task4.dataReader.DataReaderTask4;
import by.htp.basicOOP.task4.view.ViewTask4;

public class LogicTask4 {
	ViewTask4 view = new ViewTask4();
	PriseComparator priseComparator = new PriseComparator();
	DataReaderTask4 reader = new DataReaderTask4();

	public Treasure mostExpensiveTreasure(Ñave cave) {

		cave.getTreasure().sort(priseComparator);

		return cave.getTreasure().get(99);
	}

	public Ñave choiceTreasure(Ñave cave) {
		int cost = reader.inputCost();

		int sum;
		sum = 0;
		Ñave newÑave = new Ñave();

		for (int i = 0; i < cave.getTreasure().size(); i++) {
			if (cave.getTreasure().get(i).getCost() + sum <= cost) {
				sum = sum + cave.getTreasure().get(i).getCost();
				newÑave.setTreasure(cave.getTreasure().get(i));
			}
		}

		return newÑave;
	}

}
