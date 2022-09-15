package pack.array;
//Write a Java Program to Remove all Characters in Second String which are Present in First String.
public class RemovedAll {
	public static void main(String args[]) {

		String s1="hello";
		String s2="world";
		String newstr="";
		String n="";
		char[] cs1=s1.toCharArray();
		char[] cs2=s2.toCharArray();
		for(int j=0;j<cs2.length;j++)
		{
			for(int i=0;i<cs1.length;i++)
			{
				if(cs1[i]==cs2[j]) {
					cs2[j]=0;
				}
			}
		
		
		}
		
		for(int i=0;i<cs2.length;i++)
		{
			
			newstr=newstr+String.valueOf(cs2[i]);
		}
		System.out.println(newstr);
		
		
	}
}
