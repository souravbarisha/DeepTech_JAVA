package pack.array;

import java.util.Scanner;

//write a java program to remove the characters at even indexes and then print the new string without using any method for removing
public class RemovingIndex {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String s = sc.nextLine();
	
	String s1 ="";
	
	for(int i=0; i<s.length();i++) {
		if(i%2==0) {
		char ch = s.charAt(i);
		s1 += ch ;
		continue;
		}
		
	}
	System.out.print(s1);
}
}
