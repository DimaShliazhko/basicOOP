package by.htp.basicOOP.task4.dataReader;

import java.util.Scanner;

public class DataReaderTask4 {

	public int inputCost() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¬ведите заданную сумму");
		int cost;
		cost = scanner.nextInt();

		return cost;
	}

}
