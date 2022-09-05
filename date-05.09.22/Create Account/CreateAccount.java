package excep_hand.pack;
//Write a Java Program to Create Account with 500 Rs Minimum Balance
//Create  a Class Called LessBalanceException Which returns
//the Statement that Says WithDraw Amount(_Rs) is Not Valid if the amount withdrawn is more than the
//balance.
public class CreateAccount {
	public static void checkBalance (double balance,double withDraw) throws LessBalanceException {
		
		if (balance < withDraw) {
			throw new LessBalanceException("WithDraw Amount "+withDraw +" Rs) is Not Valid ,because the  withdrawn amount is more than balace amount");
		}
		else if (balance < 500) {
			throw new LessBalanceException("WithDraw Amount "+balance +" Rs) is Not Valid ,because the  balace amount is less than 500 rs.");
		}
		else {
			System.out.println("Transaction successfull");
		}
	}
	
	public static void checkDiposite(double diposite) throws LessBalanceException{
		if(diposite < 500) {
			throw new LessBalanceException("WithDraw Amount "+diposite +" Rs) is Not Valid ,because the  diposite amount is more than 500 rs.");
		}
		else {
			System.out.println(" diposite done and the Transaction successfull");
		}
	}

}
