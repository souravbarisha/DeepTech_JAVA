package primeNum;

import java.util.Scanner;

public class primeOrNot {
//	WAP to input a number and check whether it is prime number or not.
public static void main(String [] args) {
	Scanner sc = new Scanner (System.in);
	 System.out.println(" Enter the number");
	int num = sc.nextInt();
	
	boolean flag= false;
	if(num==1) {
		flag= false;
	}
	for(int i=2; i<num/2; i++) {
		if(num%i==0) {
			flag=true;
			break;
		}
		
	}
	 if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
}
}
