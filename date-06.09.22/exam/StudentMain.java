package pack.array;

import java.util.Scanner;

public class StudentMain {
public static void main(String []args) {
	Result r1=new Result();
//	input 
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter name of the student : ");
	r1.name=sc.nextLine();
	
	System.out.println("Enter the RollNo : ");
	r1.roll_no=sc.nextInt();
	
	System.out.println("Enter the 1st subject's Marks : ");
	r1.marks1=sc.nextInt();
	System.out.println("Enter the 2nd subject's Marks : ");
	r1.marks2=sc.nextInt();
//	call the functions
	r1.per_display();
	r1.percent_call();
}
}
