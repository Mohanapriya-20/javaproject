package com.training.basics;

import java.util.Scanner;

enum Vehicle {
	SKODA("Sedan", 18000.90), SCORPIO("SUV", 20000.90), NANO("MINI", 1003.90);

	String features;
	double price;

	Vehicle(String f, double price) {
		this.price = price;
		this.features = f;
	}
}

public class EnumDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// get choice from user
		String choice = sc.next().toUpperCase();
		// Convert enum in an array
		Vehicle[] enumArray = Vehicle.values();
		// create a dummy enum variable to store users choice
		Vehicle vehicle = null;
		boolean f = false;
		for (Vehicle v : enumArray) {
			// check if users choice is equal to enum value
			if (choice.equals(v.name())) {
				f = true;
				vehicle = Vehicle.valueOf(choice);
				break;
			}
		}
		if (!f) {
			System.out.println("enter valid name");
			System.exit(0);
		}
		switch (vehicle) {
		case SKODA:
			System.out.println("YOUR CHOICE IS SKODA");
			System.out.println("Type " + vehicle.features);
			System.out.println("Price " + vehicle.price);
			break;
		case SCORPIO:
			System.out.println("YOUR CHOICE IS HONDA");
			System.out.println("Type " + vehicle.features);
			System.out.println("Price " + vehicle.price);
			break;
		case NANO:
			System.out.println("YOUR CHOICE IS TATA");
			System.out.println("Type " + vehicle.features);
			System.out.println("Price " + vehicle.price);
			break;
		}

	}
}
