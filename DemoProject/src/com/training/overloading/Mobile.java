package com.training.overloading;

public class Mobile {
      
	String brand, model;
	double price;
	public Mobile() {
		
		super();
		System.out.println("Default");
	}
	public Mobile(String brand) {
		this();
		System.out.println("One parameter");
		this.brand = brand;
		
	}
	public Mobile(String brand, String model) {
		this(brand);
		System.out.println("Two parameter");
		
		this.model = model;
	}
	public Mobile(String brand, String model, double price) {
		this(model,brand);
		System.out.println("three parameter");
		
		this.price = price;
	}
	void getDetails()
	{
		System.out.println("--------------MOBILE DETAILS--------------");
		System.out.println("Brand Name: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args) {
		Mobile m=new Mobile("RE","RE2018",20000);
		Mobile m1=new Mobile("RE","RE2018");
		m.getDetails();
		System.out.println("\n");
		m1.getDetails();
	}
	

}
