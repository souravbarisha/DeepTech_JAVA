package function1;

import java.util.Scanner;

//WAP to create a class called Number.Take a variable as num
//and return true if the number is even otherwise return false.
//		Note: Use method.
public class function1 {
	
		int num;
	
 boolean evenOrNot(int num) {

	if(num%2==0) {
		return true;
	}
	return false;
}

public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	function1 ev = new function1();
	System.out.println(" enter the number ");
	ev.num= sc.nextInt();
	boolean ans=ev.evenOrNot(ev.num);
	System.out.println(ans);
}
}
