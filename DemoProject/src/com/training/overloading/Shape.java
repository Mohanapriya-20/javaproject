package com.training.overloading;

public class Shape {
	
	void calcArea(int side){
		System.out.println("Square "+(side*side));
	}
	void calcArea(float radius){
		System.out.println("Circle "+ Math.PI*radius*radius);
	}
	int calcArea(int length, int breadth){
		return (length *breadth);
	}
	/*double calcArea(int height, float length){
		return 0.5*height*length ;
	}*/
}
