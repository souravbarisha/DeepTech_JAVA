package sum;

import java.util.Scanner;

//Write a program to calculate the sum of following series where n is input by user. 
//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
public class sum {

public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Nth number");
	int num = sc.nextInt();
	double i, sum=0.0;
	for(i=1;i<=num;i++) {
		sum+=1/i;
	}
	System.out.println(sum);
}
}
