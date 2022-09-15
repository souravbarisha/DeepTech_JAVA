package pack.array;


import java.util.Scanner;
//Write a Java Program to Delete All Repeated Words in String.
public class RemovedDuplicateWords {
public static void main(String [] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("write a string : ");
      String senc = sc.nextLine();

      String [] words = senc.split(" ");
      String newSenc="";
      
     for(int i=0; i<words.length; i++) {
    	 for(int j=i+1; j<words.length; j++) {
    		 if(words[i].equals(words[j])) {
    			 words[i]= "remove";
    		 }
         }
        }
     for(String word : words) {
    	 if(word != "remove") {
    		 newSenc += word + " ";
    	 }
     }
     System.out.println("sentence after removing duplicate words : "+ newSenc);
}
}
