package pack.array;

import java.util.Scanner;

//WAP to input an array in random order and then sort it using bubble sort and then search for a given element from that sorted array
public class BoubleSort_SearchEle {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in); 
	int [] arr = new int [10];
	System.out.println("create an array by enter the elements : ");
	
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
	}
	
	
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("SEARCH THE ELEMENT : ");
	int search = sc.nextInt();
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==search) {
			System.out.println("the element is available and it's index position is : "+ i);
			break;
		}
		else {
			System.out.println("the element is not available ");
		}
	}
}
}
