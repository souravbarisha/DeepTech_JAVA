package oops.pack;

import java.util.Scanner;

public class InvoiceMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter invoice number");
	String invo = sc.nextLine();
	System.out.println("Write the description of the item");
	String des = sc.nextLine();
	System.out.println("Enter the no of items");
	int items = sc.nextInt();
	System.out.println("Enter the price");
	double price = sc.nextDouble();
	
	Invoice in = new Invoice(invo,des,items,price);
	double result= in.amount();
	System.out.println(result);
}
}
