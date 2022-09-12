package pack.array;

import java.util.Scanner;

//WAP to input a string and reverse it without using any inbuilt method
public class ReversString {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String s = sc.nextLine();
	
	String s1 ="";
	
	for(int i=0; i<s.length();i++) {
		char ch = s.charAt(i);
		s1 = ch + s1;
		
	}
	System.out.print(s1);
}
}
