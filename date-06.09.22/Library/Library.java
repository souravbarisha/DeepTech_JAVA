package excep_hand.pack;
//Consider a Library Management System, where a user wants to find a book. If the
//book is present in Library (Hint: Use predefined array), then it will print the book.
//Otherwise it will throw an exception “BookNotFoundException”.
public class Library {
    static void findBook ( String [] arr,String search) throws BookNotFoundException {
	  boolean flag = false;
	   for(int i=0;i<arr.length;i++) {
	   
	   if(search.equals (arr[i]) ) {
		  flag = true;
		  break;  
	   }
	   
	 
	   }
	   if (flag) {
	   System.out.println("The "+search+" book is availabe");
	   }
	   else {
		   throw new BookNotFoundException("Book not found");
	   }
   }
    
}
