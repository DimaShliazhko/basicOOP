package by.htp.basicOOP.task5.main;

import java.util.ArrayList;

import by.htp.basicOOP.task5.bean.Gift;
import by.htp.basicOOP.task5.bean.Packing;
import by.htp.basicOOP.task5.bean.Sweet;
import by.htp.basicOOP.task5.view.ViewTask5;

public class MainTask5 {
	public static void main(String[] args) {

		ViewTask5 view = new ViewTask5();
		Gift gift = new Gift();
		Packing packing = new Packing("�������2");
		

		gift.setName("�������");
		gift.setCost(50);
		gift.setNewpackage(new Packing("�������"));

		gift.setSweets(new Sweet("�������"));
		gift.setSweets(new Sweet("�������"));
		gift.setSweets(new Sweet("������"));
		gift.setSweets(new Sweet("�������"));
		gift.setSweets(new Sweet("�������"));

		view.printSweet(gift.getSweets());
		view.printGift(gift);
		//System.out.println(gift.getSweets().isEmpty());
		
		

	}

}
