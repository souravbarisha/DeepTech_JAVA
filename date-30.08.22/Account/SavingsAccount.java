package oops1.pack;

public class SavingsAccount extends Account {
	double rateOfInterest;
	SavingsAccount(){
	this.rateOfInterest = rateOfInterest;
	this.accountHoldersName = accountHoldersName;
	this.accountNumber = accountNumber;
	this.Balance = Balance;
	this.address = address;
	}
 
 void calculateAmount() {
	 System.out.println("interest amount of 1 year is : "+ (this.Balance * this.rateOfInterest * 1)/100);
 }

@Override
void withdrawl() {
	System.out.println("Withdrawl ammount is : "+ 20000);
	
}

@Override
void deposit() {
	System.out.println("deposit ammount is : "+ 5000);
	
}
}
