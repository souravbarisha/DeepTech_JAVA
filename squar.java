package squar;

import java.util.Scanner;

public class squar {
public static void main(String [] args) {
	int x,y,num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first integer");
	x=sc.nextInt();
	System.out.println("Enter the second integer");
	y=sc.nextInt();
	System.out.println("Enter the number");
	num=sc.nextInt();
	int z=x*x+y*y;
	if(z==num) {
		System.out.println("Equal");
	}else {
		System.out.println("not Equal");
	}
}
}
