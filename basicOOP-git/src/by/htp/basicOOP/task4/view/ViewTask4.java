package by.htp.basicOOP.task4.view;

import by.htp.basicOOP.task4.bean.Treasure;
import by.htp.basicOOP.task4.bean.�ave;

public class ViewTask4 {

	public void printTreasure(�ave cave) {
		for (int i = 0; i < cave.getTreasure().size(); i++) {
			System.out.println(cave.getTreasure().get(i).toString());
		}
	}
	
	public void printTreasure(Treasure treasure) {
		
			System.out.println(treasure.toString());
		}
	}


