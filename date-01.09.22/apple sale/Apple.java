package pack.array;

import java.util.Scanner;

//Write a program to accept value of apple sales for each day of the week (using array of
//type float) and then, calculate the average sale of the week.
public class Apple {
public static void main(String[] args) {
	float arr[] = new float[7];
	float sum = 0;
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<7;i++) {
		System.out.println("Enter the sale of day "+(i+1)+" ");
		arr[i]= sc.nextFloat();
 }
	for(int i=0;i<7;i++) {
		sum =sum + arr[i];
	}
	
	System.out.println("The average sale of the week : "+sum/7);
}
}
