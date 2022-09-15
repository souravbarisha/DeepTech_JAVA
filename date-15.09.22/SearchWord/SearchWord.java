package pack.array;

import java.util.Scanner;

public class SearchWord {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write something and create a string : ");
	String str = sc.nextLine();
	
	System.out.println("Enter the word to search");
	String search = sc.nextLine();
	
	str.toLowerCase();
	String [] s = str.split(" ");
	
	boolean flag = true;
	int i;
	for( i=0; i<s.length; i++) {
		if(s[i].equals(search)) {
			flag = true;
		break;
		}
		else {
			flag = false;
		}
	}
		
	if(flag==true) {
		System.out.println("The word is present in "+i +" th index position");
	}
	else {
		System.out.println("This is not found in the sentence");
	}
	
}
}
