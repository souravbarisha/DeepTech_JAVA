package divisibly_by;

//Write a Java Program to check whether a number is divisibly by 5 as well as 3
public class divisibly_by {

	public static void main(String [] args) {
		int num= 15;
		if((num%3==0) && (num%5 ==0)){
			System.out.println("this is divisible by 3 and 5 both");
		}
		else
			System.out.println("this is not divisible by 3 and 5 both");
	}
}
