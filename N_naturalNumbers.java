package naturalNumbers;

import java.util.Scanner;

public class N_naturalNumbers {
//	Write a program in Java to display n terms of natural numbers and their sum.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth number");
		int n = sc.nextInt();
		int sum=0;
		for(int i= 1; i<=n; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("sum of these  "+ sum);
	}
}
