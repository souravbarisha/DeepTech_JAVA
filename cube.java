package cube;

import java.util.Scanner;
//Write a program in Java to display the cube of the number upto given an integer.
public class cube {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	for(int i=1; i<=n; i++) {
		System.out.println(" cube of "+i +" is : "+ i*i*i );
	}
}
}
