package com.training.demos;

public class DynaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[][] = new int[3][];
		marks[0]=new int[3];
		marks[1]=new int[2];
		//marks[2]=new int[1]; // memory not allocated
		
		System.out.println(marks[0][0]);
		marks[0][0]=90;
		marks[0][1]=60;
		marks[0][2]=70;
		
		marks[1][0]=78;
		marks[1][1]=86;
		
		marks[2][0]=67; // nullpointer exception
		
		//marks[2][1]=86; // ArrayIndexOutOfBOundsException
		
		for (int[] row : marks) {
			for (int value : row) {
				System.out.print(value+"\t");
			}
			System.out.println();
		}		
		

	}

}
