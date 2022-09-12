package excep_hand.pack;

import java.util.Scanner;

public class PasswordMain {
public static void main(EqualString [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your password : ");
	int pa = sc.nextInt();
	try {
		Password.check_password(pa);
	}
	catch(AuthenticationFailureException p) {
		System.out.println(p.getMessage());
	}
}
}
