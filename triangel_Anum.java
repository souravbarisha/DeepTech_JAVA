package triangel;

import java.util.Scanner;

public class triangel_Anum {
//	Write a program in Java to display the pattern like right angle triangle with a number
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	System.out.println("How many row you want");
	int row = sc.nextInt();
	
	for(int i=0; i<row; i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
}
