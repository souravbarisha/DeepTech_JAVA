package pack.array;
//Write a java program to input 5 elements of an array and search for a number whether it is present
//in an array or not. If present print its position in the array
import java.util.Scanner;
public class Search {

	static void searchElement(int [] arr, int ele) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==ele)
				System.out.println("The position of "+ele+" is : "+ i);
		}
	}

public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	int [] arr = new int [5];
	for(int i=0; i<5; i++) {
		System.out.println("Enter the "+(i+1)+"th number");
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the element top find the position");
	int ele = sc.nextInt();
	 searchElement(arr, ele);
}
}