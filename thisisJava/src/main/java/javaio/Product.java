package javaio;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = -634523473948579340L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		
	}
	@Override
	public String toString() { return name + " " +price;}
	

}
