package oops1.pack;

import java.util.Scanner;

public class AccountMain {
public static void main(String []args) {
	SavingsAccount sa = new SavingsAccount();
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter The Account Holder Name : ");
	sa.accountHoldersName =sc.nextLine();
	
	System.out.println("Enter The Address Of The Holder : ");
	sa.address =sc.nextLine();
	
	System.out.println("Enter The Account Number : ");
	sa.accountNumber =sc.nextInt();
	
	System.out.println("Enter The Balance Amount : ");
	sa.Balance =sc.nextDouble();
	
	System.out.println("Enter The Rate Of Interest : ");
	sa.rateOfInterest =sc.nextDouble();
	
	
	sa.withdrawl();
	sa. deposit();
	sa.calculateAmount();
}
}
