package pack.array;
//1. WAP to input an array having 5 strings and display them.
import java.util.Scanner;

public class Array1 {
public static void main(String [] args) {
	Scanner sc = new Scanner (System.in);
	String []arr = new String[5];
	
	System.out.println("enter the names");
	for( int i=0; i<5;i++) {
		
		arr[i] = sc.nextLine();
		
	}
	for(int i=0; i<5;i++) {
		System.out.println(arr[i]);
	}
	
	
	
}
}
