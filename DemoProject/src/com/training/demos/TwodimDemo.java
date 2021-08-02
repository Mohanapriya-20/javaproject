package com.training.demos;
import java.util.Scanner;

public class TwodimDemo {

	
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int marks[][] = new int[3][2];
			System.out.println("Populating");
			for (int i = 0; i < marks.length; i++) {
				for (int j = 0; j < 2; j++) {
					marks[i][j]=sc.nextInt();
				}
			}
			System.out.println("Iterating");
			for (int i = 0; i < marks.length; i++) {
				for (int j = 0; j < 2; j++) {
					System.out.print(marks[i][j]+"\t");
				}
				System.out.println();
			}
			
			System.out.println("Using for Each");
			for(int row[]:marks){
				for(int value: row){
					System.out.println(value);
				
				}}
	}

}
