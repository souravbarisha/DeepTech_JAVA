package excep_hand.pack;
//Write a program to throw a user-defined exception "String Mismatch Exception", if two strings are not equal (ignore the case).
public class EqualString {
static void checkStrings (String s1, String s2) throws StringMismatchException {
	if(s1.equalsIgnoreCase(s2)) {
		System.out.println("two strings are equal");
	}
	else {
		throw new StringMismatchException ("two strings are not equal");
	}
}
}
