package sum_ava;

import java.util.Scanner;
//Write a program in Java to input 5 numbers from keyboard and find their sum and average.

public class sum_average {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a");
	int a= sc.nextInt();
	System.out.println("Enter b");
	int b= sc.nextInt();
	System.out.println("Enter c");
	int c= sc.nextInt();
	System.out.println("Enter d");
	int d= sc.nextInt();
	System.out.println("Enter e");
	int e= sc.nextInt();
	
	int sum = a+b+c+d+e;
	int ave = sum/5;
	System.out.println(sum);
	System.out.println(ave);
}
}
