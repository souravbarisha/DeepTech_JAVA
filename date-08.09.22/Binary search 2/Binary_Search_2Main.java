package pack.array;

import java.util.Scanner;

public class Binary_Search_2Main {
public static void main (String[] args) {
	Binary_Search_2 bs = new Binary_Search_2();
	Scanner sc = new Scanner(System.in); 
	int [] arr = new int [10];
	System.out.println("please create the array");
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
      }
	
	System.out.println("please create the searching element");
	int search = sc.nextInt();
	
	bs.searchEle(arr,search);
}
}
