package by.htp.basicOOP.task2.main;

import by.htp.basicOOP.task2.bean.Payment;

public class MainTask2 {

	public static void main(String[] args) {

		Payment payment = new Payment("�������");
		// System.out.println(product3.toString());
		// System.out.println(payment.toString());

		payment.setProduct(payment.createProduct("�������", 20));
		payment.setProduct(payment.createProduct("������", 30));
		payment.setProduct(payment.createProduct("����", 40));
		System.out.println(payment.toString());
		

	}

}
