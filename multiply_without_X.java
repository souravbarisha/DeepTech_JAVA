package multiply;

import java.util.Scanner;

public class multiply_without_X {
//	Write a Java program to multiply two given integers without using the multiply operator(*).
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Enter another number");
		int b = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=a; i++) {
			sum= sum+b;
		}
		System.out.println("multiplication of "+a +" and "+b +" is "+ sum);
	}
}
