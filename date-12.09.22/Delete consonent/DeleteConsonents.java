package pack.array;
//Write a program to delete all consonents from the string "Hello, have a good day".
public class DeleteConsonents {
public static void main(String [] args) {
	String s = "Hello, have a good day";
	s.toLowerCase();
	String s1= "";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
			
			s1 += s.charAt(i);
		
		}
		
	}
	System.out.println(s1);
}
}
