package com.training.overloading;

public class Student {
	String name,city;
	int studentId;
	
	public Student(){
		System.out.println("in default");
	}
	public Student(String name,int id){
		this.name=name;
		studentId = id;
	}
	
	public Student(String name, String city, int studentId) {
		
		this.name = name;
		this.city = city;
		this.studentId = studentId;
	}
	void getDetails(){
		if(name!=null)
			System.out.println("Name "+name);
		if(city!=null)
			System.out.println("City "+city);
		if(studentId>0)
			System.out.println("Id "+studentId);
		else
			System.out.println("No input");
		
	}
}
