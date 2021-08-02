package com.training.overloading;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		s.calcArea(5);
		s.calcArea((int)5.5f);
		System.out.println("Rectange: "+s.calcArea(5, 6));
		System.out.println("Tiangle: "+s.calcArea(5, (int)6.0f));
	}

}
