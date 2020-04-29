package by.htp.basicOOP.task5.view;

import java.util.ArrayList;

import by.htp.basicOOP.task5.bean.Gift;
import by.htp.basicOOP.task5.bean.Sweet;

public class ViewTask5 {

	public void printGift(Gift gift) {
		System.out.println(gift.toString());
	}
	

	public void printSweet(ArrayList<Sweet> sweet) {
		for(int i=0; i < sweet.size(); i++ ) {
			System.out.println(sweet.get(i).toString());	
		}
		

	}

}
