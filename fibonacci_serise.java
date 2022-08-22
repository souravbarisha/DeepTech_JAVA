package do_while;

public class fibonacci_serise {
 public static void main(String [] args) {
	 int a=0;
	    int b=1;
	    int temp;
	    int i=2;
	    do { 
	    	temp=a+b;
	        a=b;
	        b=temp;
	        i++;
	        System.out.println(temp);
	    }while(i<=10);
 }
}
