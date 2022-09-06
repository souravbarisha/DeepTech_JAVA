package excep_hand.pack;

import java.util.Scanner;

public class LibraryMain {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	
	 String [] arr = {"pather panchali","bomkesh bakshi","dev das","ghare baire","shes lekha"}; 
	
	
	 System.out.println("find the book");
	 String search = sc.nextLine();
	 
	try {
		
		Library.findBook(arr,search);
	}
	catch(BookNotFoundException e){
		System.out.println(e.getMessage());
	}
}
}
