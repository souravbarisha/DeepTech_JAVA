package vowel;

import java.util.Scanner;

public class vowel {
//	Write a Java program that takes the user to provide a single character
//	from the alphabet. Print Vowel or Consonant, depending on the user input.
//	If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,print an error message.
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a alphabet");
	String input = sc.next().toLowerCase();
	
	boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <=90;
	boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <=122;
	boolean vowel = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
	
	if(input.length() >1 ) {
		System.out.println("Error. Not a singel character");
	}
	else if(!(uppercase || lowercase)) {
		System.out.println("Error. Not a letter. plese enter a character");
	}
	else if(vowel) {
		System.out.println("Input letter is vowel");
	}
	else {
		System.out.println("Input letter is consonant");
	}
}

}
