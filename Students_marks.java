//Write a Java Program to take marks of a student and then print his/her grade depending on the following conditions:
//90 to 100 then grade is A+, 
//80 to 90  then grade is A
//70 to 80 then grade is B+
//60 to 70 then grade is B
//50 to 60 then grade is C
//40 to 50 then grade is D
//30 to 40 then grade is E
//less than 30 then grade is F

public class Students_marks {
	public static void grade_Marks(int marks) {
		if(marks<0) {
			System.out.println("Invalid");
		}
		if(marks>=90 && marks<=100) {
			System.out.println("grade is : A+");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("grade is : A");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("grade is : B+");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("grade is : B");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("grade is : C");
		}
		else if(marks>=40 && marks<50) {
			System.out.println("grade is : D");
		}
		else if(marks>=30 && marks<40) {
			System.out.println("grade is : E");
		}
		else {
			System.out.println("grade is : F");
		}
		
	}
	
public static void main(String [] args) {
	int marks = 86;
	
	grade_Marks(marks);
}
}
