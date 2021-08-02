package com.training.demos;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	  int a[]=new int[8];
		int odd[]=new int[4];
		int even[]=new int[4];
		int u=0,v=0;
	
		for(int i=0;i<8;i++)
			a[i]=sc.nextInt();
	for(int var:a)
	{
		if(var%2==0)
		{
			even[u]=var;
			u++;
		}
		else
		{
			odd[v]=var;
			v++;
		}
	}
		System.out.println("even array");
		for(int var:even)
			System.out.println(var);
		System.out.println("odd array");
		for(int var:odd)
			System.out.println(var);
	}
}
