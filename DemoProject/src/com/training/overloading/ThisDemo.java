package com.training.overloading;

public class ThisDemo {

	   public ThisDemo()
      {
		   this("Virat");
    	  System.out.println("Hello");
      }
	   public ThisDemo(String name)
	   {
		   System.out.println("Welcome "+name);
	   }
	   public ThisDemo(int val)
	   { this();
		   System.out.println("You have entered "+val);
	   }
	   public static void main(String[] args) {
		//   ThisDemo td=new ThisDemo();
		   ThisDemo td1=new ThisDemo(10);
	}
	   
	}


