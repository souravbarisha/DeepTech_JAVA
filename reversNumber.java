package reversNum;

import java.util.Scanner;

public class reversNumber {
//	Write a java program to input a number and reverse it
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int rev=0;
		while(num!=0) {
			int rem= num%10;
			rev= rev*10 + rem;
			num= num/10;
		}
		System.out.println("The revers of the number is : "+ rev);
	}
}
