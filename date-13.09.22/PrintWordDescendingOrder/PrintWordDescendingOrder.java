package pack.array;

import java.util.Scanner;

public class PrintWordDescendingOrder {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write something here : ");
	String s = sc.nextLine();
	s.toUpperCase();
	
	String[] arr=s.split(" ");
	for(int i=0;i<arr.length;i++)
	{
		
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j+1].length()>arr[j].length()) {
				String temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
		
		for(String i:arr) {
			System.out.print(i +" ");
		}
	}
}

