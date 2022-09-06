package pack.array;

public class Result extends Student implements Exam  {

	public void percent_call() {
		
		 double persent = (marks1 + marks2)/2;
		 System.out.println("persentage of the student is : "+ persent);
		
	}
	 void per_display() {
		 System.out.println("Name of the student : "+ name);
		 System.out.println("Roll No of the student : "+ roll_no);
		 System.out.println("marks of 1st subject : " + marks1 + "  marks of 1st subject : "+ marks2);
	 }
}
