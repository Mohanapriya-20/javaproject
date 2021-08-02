package com.training.overriding;
import java.util.Scanner;
public class ATMClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter account type:S/C ");
   String a=sc.next();
   Account account;
   if(a.equals("S"))
   {
	   account=new Saving(5000);
	   
   }
   else if(a.equals("C"))
   {
	   account =new Current(7000);
	   Current current=(Current)account;
	   current.checkInterest();
   }
   else
   {
	   account=new Account(1000);
   }
   account.withdraw(100);
   System.out.println("Balance "+account.getBalance());
   account.deposit(300);
   System.out.println("Balance "+account.getBalance());
   
   }

}
