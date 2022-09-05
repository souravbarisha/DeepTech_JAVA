package excep_hand.pack;
//WAP to input the salary of an employee and if the salary is not in the range of 10,000 to 20,000 
//an invalid salary exception should be thrown.
public class Salary {

	static void monthlySal (int payment) throws InvalidSalaryException {
		if(payment >= 10000 && payment <= 20000) {
			System.out.println (" payment done");
		}
		else {
			throw new InvalidSalaryException("Salary should not less than 10000 and not more than 20000");
		}
		
	}
}
