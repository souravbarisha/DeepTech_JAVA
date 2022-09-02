package pack.array;

import java.util.Scanner;

//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100).
//The marks are entered by user.
public class RollNo {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<8;i++) {
		for(int j=0;j<8;j++) {
		System.out.println("Enter the roll number : ");
		int roll = sc.nextInt();
		
		System.out.println("Enter the marks of subject A : ");
		int A = sc.nextInt();
		System.out.println("Enter the marks of subject B : ");
		int B = sc.nextInt();
		System.out.println("Enter the marks of subject C : ");
		int C = sc.nextInt();
		
		float avg = (A+B+C)/3;
		
		
		
	}
		System.out.println("ROLL NUMBER : "+ roll +" average marks is : "+ avg);
	}
}
}
