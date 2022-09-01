package pack.array;

import java.util.Scanner;
//2. WAP to input an array having 3 rows and 3 columns of type String.
public class matrix1 {
public static void main(String []args) {
	Scanner sc = new Scanner (System.in);
	String [][] Arry = new String[3][3];
	System.out.println("enter the names");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			Arry[i][j] = sc.nextLine();
		}
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(Arry[i][j]+" ");
		}
		System.out.println();
	}
}
}
