package by.htp.basicOOP.task2.bean;

import java.util.ArrayList;

/*
 * 
 * Создать класс Payment с внутренним классом, 
 * с помощью объектов которого можно сформировать
 *  покупку из нескольких товаров.
 * 
 */

public class Payment {

	private String name;
	private ArrayList<Product> product = new ArrayList<Product>();

	public Payment() {

	}

	public Payment(String name) {
		this.name = name;
	}

	public Payment(String name, ArrayList<Product> product) {
		this.name = name;
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Product> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}

	public void setProduct(Product product) {
		this.product.add(product);
	}

	@Override
	public String toString() {
		return "Payment [name=" + name + ", product=" + product + "]";
	}

	public Product createProduct(String name, int cost) {
		Product product = new Product(name, cost);
		return product;
	}

	private class Product {
		private String name;
		private int cost;

		
		public Product(String name, int cost) {

			this.name = name;
			this.cost = cost;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", cost=" + cost + "]";
		}

	}

}
