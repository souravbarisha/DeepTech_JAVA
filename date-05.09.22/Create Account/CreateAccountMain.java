package excep_hand.pack;

public class CreateAccountMain {
public static void main(String [] args) {
	try {
	CreateAccount.checkBalance(5000.00,6000.00);
	}
	catch(LessBalanceException e) {
		System.out.println(e.getMessage());
	}
	
	try {
		CreateAccount.checkDiposite(400.00);
		}
		catch(LessBalanceException p) {
			System.out.println(p.getMessage());
	}
}
}
