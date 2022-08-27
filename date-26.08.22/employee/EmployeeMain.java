package oops.pack;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pan card number");
		String pan = sc.nextLine();
		
		System.out.println("Enter Your Name");
		String nam = sc.nextLine();
		
		System.out.println("Enter Your Yearly Income");
		int income = sc.nextInt();
		
		
    Employee em = new Employee(pan,nam,income);
    
    float tax = em.calculateTax();
    
    System.out.println("Your payable income tax is : "+ tax);
	}
}
