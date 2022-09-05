package excep_hand.pack;

public class SalaryMain {
	public static void main(String []args) {
		try {
			Salary.monthlySal(12000);
		}
		catch(InvalidSalaryException in) {
			System.out.println(in.getMessage());
		}
	

	}
}
