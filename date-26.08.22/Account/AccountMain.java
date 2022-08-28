package oops.pack;

import java.util.Scanner;

public class AccountMain {
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();
	System.out.println("Enter the id number : ");
	ac.ID = sc.nextInt();

	System.out.println("Enter the balace of the account : ");
	ac.balance = sc.nextInt();
	
	System.out.println("Enter the current annual interest rate : ");
	 ac.annualInterestRate = sc.nextDouble();
	
//	System.out.println("Enter the  account created date : ");
//	 ac.dateCreated = sc.nextLine();
	
	System.out.println("Enter the withdraw amount : ");
	double withdrawAmount = sc.nextDouble();
	
	System.out.println("Enter the deposite amount : ");
	double depositeAmount = sc.nextDouble();
	
	
	 System.out.println("Monthly interest rate is : "+ ac.getMonthalyInterrestRate());
	 
	 System.out.println("Monthly interest amount is : "+ ac.getMonthalyInterrest());
	 
//	 System.out.println("date of the account create is : "+ ac.dateCreated);
	 
	 System.out.println("Monthly withdraw amount is : "+ ac.withdraw(withdrawAmount));
	 
	 System.out.println("Monthly deposite amount is : "+ ac.deposite(depositeAmount));
	
}
}
