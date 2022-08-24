import java.util.Scanner;

public class GCD_HCF {
//	Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers

public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the 1st number");
		int a= sc.nextInt();
     System.out.println("Enter the 2nd number");
		int b= sc.nextInt();
	while(b !=0) {
		if(a>b) {
			a=a-b;
		}
		else {
			b=b-a;
		}
	}
	System.out.println("GCD IS : "+a);
}
}

