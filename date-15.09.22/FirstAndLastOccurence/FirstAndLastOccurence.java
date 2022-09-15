package pack.array;
//Write a program to find the first and the last occurence of the letter 'o'  in "Hello World".
public class FirstAndLastOccurence {
public static void main(String [] args) {
	String s = "Hello World";
	s.toLowerCase();
	int lastOccur = 0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='o') {
			System.out.println("First Occurence is : "+i);
			break;
		}
	}
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='o') {
			lastOccur = i;
		}
	}
	System.out.println("Last Occurence is : "+lastOccur);
}
}
