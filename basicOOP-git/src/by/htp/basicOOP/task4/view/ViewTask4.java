package by.htp.basicOOP.task4.view;

import by.htp.basicOOP.task4.bean.Treasure;
import by.htp.basicOOP.task4.bean.Ñave;

public class ViewTask4 {

	public void printTreasure(Ñave cave) {
		for (int i = 0; i < cave.getTreasure().size(); i++) {
			System.out.println(cave.getTreasure().get(i).toString());
		}
	}
	
	public void printTreasure(Treasure treasure) {
		
			System.out.println(treasure.toString());
		}
	}


