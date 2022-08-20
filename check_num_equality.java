package check_equality;
//Write a Java program that takes four integers and prints equal if all four are equal, and not equal otherwise.
public class check_num_equality {
	
	public static void main(String [] args) {
		int a,b,c,d;
		a=10;
		b=11;
		c=100;
		d=110;
		
		if(a == b && b == c && c == d && a ==d) {
			System.out.println("equal");
		}
		else
			System.out.println(" Not equal");
	}

}
