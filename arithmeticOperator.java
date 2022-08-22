package arithmetic_Operator;

import java.util.Scanner;

public class arithmeticOperator {
//	Write a java program to input any arithmetic operator and perform all the arithmetic operations
//	based on the operator given in the input.
//	Note: use switch for this program
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Arithmetic Operator");
	char ch = sc.next().charAt(0);
	
	switch(ch) {
	
	case '+':
		System.out.println("Used for ->>> addition");
		break;
		
	case '-':
		System.out.println("Used for ->>> subtraction");
		break;
		
	case '*':
		System.out.println("Used for ->>> multiplication");
		break;
		
	case '/':
		System.out.println("Used for ->>> division");
		break;
		
	case '^':
		System.out.println("Used for ->>> exponentiation ");
		break;
		
	case '%':
		System.out.println("Used for ->>> modulus");
		break;
		
	default :
		System.out.println("This is not Arithmetic Operator");
		
	}
	
}
}
