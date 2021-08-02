package com.training.inheritance;

public class Manager extends Employee {
	int salary;

	public Manager(String name,int empId,int salary) {
		super(name,empId);
		System.out.println(name+","+empId);
		
		this.salary=salary;
	}

	void calcBonus(int a) {
		System.out.println("Bonus " + salary * a);

	}

}
