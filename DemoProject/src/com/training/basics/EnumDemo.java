package com.training.basics;
import java.util.Scanner;
enum Fruits {
APPLE, MANGO, STRAWBERRY, ORANGE;

}

public class EnumDemo {
public static void main(String[] args) {

	// convert enum into a array
	Fruits[] fruits = Fruits.values();
	for (Fruits fruit : fruits) {
		System.out.println(fruit.name());
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("enter choice");
	String choice = sc.next().toUpperCase();

	Fruits fruit = null;
	for (Fruits nfruit : fruits) {
		// convert enum constant to string
		if (nfruit.name().equals(choice)) {
			// convert string to enum constant
			fruit = Fruits.valueOf(choice);
		}
	}
	/*if (fruit == null) {
		System.out.println("wrong input");
		System.exit(0);
	}*/

	switch (fruit) {
	case APPLE:
		System.out.println("keep the doctor away");
		break;
	case MANGO:
		System.out.println("king of fruits");
		break;

	default:
		System.out.println("does not match");
		break;
	}

}
}
