package excep_hand.pack;

import java.util.Scanner;

public class EqualStringMain {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st string");
	String s1 = sc.nextLine();
	
	System.out.println("Enter the 1st string");
	String s2 = sc.nextLine();
	try {
		EqualString.checkStrings(s1,s2);
	}

   catch(StringMismatchException c) {
	   System.out.println(c.getMessage());
   }
}

}
