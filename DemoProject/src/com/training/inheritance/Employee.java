package com.training.inheritance;

public class Employee {

	String name;
	int empId;
	
	Employee(String name,int empId){
		
		this.name=name;
		this.empId=empId;
	}
	
	void getDetails(){
		System.out.println("Name "+name);
		System.out.println("EmpId "+empId);
	}
}