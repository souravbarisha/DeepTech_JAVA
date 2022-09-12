package excep_hand.pack;
//Write a program to accept a password from the user and throw 'Authentication Failure' exception if the password is incorrect.
public class Password {
static void check_password(int pass) throws AuthenticationFailureException {
	int original= 122333;
	if(pass == original) {
		System.out.println("your password is accepted.  please wait few mins ");
	}
	else {
		throw new AuthenticationFailureException(" the password is incorrect");
	}
}
}
