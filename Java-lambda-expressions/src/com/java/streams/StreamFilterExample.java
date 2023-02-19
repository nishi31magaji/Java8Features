package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	public static void main(String[] args) {
		//filter products which has price > 50K
		List<Product>list = new ArrayList<Product>();
		for(Product product:getProducts() ) {
			if(product.getPrice()>50000) {
				list.add(product);
			}
		}
		for(Product p:list) {
			System.out.println(p);
		}
		
		//using stream api
		
		List<Product> productList =	getProducts().stream().filter((product)->product.getPrice()>50000).collect(Collectors.toList());
		//System.out.println(productList);
		productList.forEach(System.out::println);
	}

	private static List<Product> getProducts() {
		List<Product> productList = new ArrayList<Product>();

		productList.add(new Product(1, "HP Laptop", 50000));
		productList.add(new Product(2, "Lenovo Laptop", 60000));
		productList.add(new Product(3, "Dell Laptop", 70000));
		productList.add(new Product(4, "Sony Laptop", 90000));

		return productList;
	}
}

class Product {
	private int id;
	private String name;
	private float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
