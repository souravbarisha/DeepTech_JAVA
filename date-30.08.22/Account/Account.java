package oops1.pack;
//Create an abstract class Accounts with the following details:
//Data Members:
//(a) Balance (b) accountNumber (c) accountHoldersName (d) address
//Methods:
//(a) withdrawl()- abstract
//(b) deposit()- abstract
//(c) display() to show the balance of the account number
//Create a subclass of this class SavingsAccount and add the following details:
//Data Members:
//(a) rateOfInterest
//Methods:
//(a) calculateAount()
public abstract class Account {
   double Balance;
   int accountNumber;
   String accountHoldersName;
   String address;
   
   
   abstract void withdrawl();
   
   abstract void deposit();
   
   void display() {
	   System.out.println("the balance of the account number : "+ Balance);
   }
   }
