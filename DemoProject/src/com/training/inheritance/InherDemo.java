package com.training.inheritance;

public class InherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Virat", 10);
		emp.getDetails();
		
		Manager man = new Manager("harry", 11, 1000);
		man.getDetails();
		//man.calcBonus(2);
	
	}

}
