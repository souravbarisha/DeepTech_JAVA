package oops.pack;

public class Account {
int ID = 0;
double balance = 0.0;
double annualInterestRate;
String dateCreated= "abc";

Account(){
	this.ID = ID;
	this.balance = balance;
	this.annualInterestRate =  annualInterestRate;
	this.dateCreated = dateCreated;
}

double getMonthalyInterrestRate() {
	double interestRate = this.annualInterestRate/12;
	return interestRate;
 }
double getMonthalyInterrest() {
//	monthly simple interrest formula (P × R × T) / (100 × 12).
	double interest = (this.balance * this.annualInterestRate * 1)/(100*12);
	return interest;
	
}
double withdraw(double withdrawAmount) {
	
	return withdrawAmount;
}

double deposite(double depositeAmount) {
	
	return depositeAmount; 
}

}
