package pattern1;

import java.util.Scanner;
//Write a program in Java to make such a pattern like right angle triangle with number increased by 1.
public class pattern_increaseBy1 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many row you want");
		int row = sc.nextInt();
		int k=1;
		for(int i=1; i<=row; i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(k++ +" ");
			}
			System.out.println(" ");
		}
	}
}
