//Write a Java Program to find whether a number is even or odd using conditional operator
public class Odd_Even_NUM {
	public static void checkOddEven(int num) {
		if(num % 2 ==0) {
			System.out.println("The number is Even");
		}
		else
			System.out.println("The number is Odd");
	}
	
	public static void main(String []args) {
		int num= 20;
		
		checkOddEven(num);
	}

}
