package com.training.overloading;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s1=new Student("Virat",100);
		Student s2=new Student("Virat","Banglore",100);
		s1.getDetails();
		s2.getDetails();

	}

	
}
