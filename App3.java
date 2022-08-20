package quadratic_equations;

//Write a Java program to solve quadratic equations and check whether the roots are positive,equal or negative (use if, else if and else).
//
//Test Data
//Input a: 1
//Input b: 5
//Input c: 1

public class App3 {
	
 public static void main(String [] args) {
	 int a=1,b=5,c=1;
	 
	 double r1, r2;
	 
//	 determinant = b^2 -4ac
	 double determinant = b*b - 4*a*c;
//	 condition checking
	 if(determinant>0) {
		 r1 = (-b + Math.sqrt(determinant)) / (2 * a);
	     r2 = (-b - Math.sqrt(determinant)) / (2 * a);

	      System.out.println("1st root="+ r1+" " +"2nd root="+ r2);
	 }
	 else if(determinant==0) {
		 r1 = r2 = -b / (2 * a);
	      System.out.println("1st root"+ r1);
	 }
	 else {
		 double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      System.out.println("1st root"+ real+" " + imaginary);
	      System.out.println("2nd root"+ real+" " + imaginary);
	 }
 }
}
