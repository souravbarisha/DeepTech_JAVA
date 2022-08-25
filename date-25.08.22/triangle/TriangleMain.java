package oops.pack;
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
//by creating a class named 'Triangle' without any parameter in its constructor.

public class TriangleMain {
public static void main(String [] args) {
	Triangle tr= new Triangle();
	
	System.out.println("Area of triangle is= "+ tr.area());
	System.out.println("perimeter of triangle is= "+ tr.perimeter());
}
}
