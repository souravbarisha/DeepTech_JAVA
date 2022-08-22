package multipel_table;

import java.util.Scanner;

public class table {
//	Write a program in Java to display the multiplication table of a given integer.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get table");
		int num= sc.nextInt();
		for(int i = 1; i<=10; i++) {
			System.out.println(num+" * "+ i +" = "+ num*i);
		}
	}
}
