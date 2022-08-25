package oops.pack;

import java.util.Scanner;

//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
//First method named as 'setDim' takes length and breadth of rectangle as parameters and 
//the second method named as 'getArea' returns the area of the rectangle.
//Length and breadth of rectangle are entered through keyboard.
public class Area {
 float length, breadth, area;
 
 void setDim(float length, float breadth) {
	 
	 this.length= length;
	 this.breadth= breadth;
	 
	 area = length * breadth;
 }
     float getArea() {
    	 return area;
     }
     
     public static void main(String [] args) {
    	 Area ar = new Area();
    	 float l,b;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the length");
    	 l= sc.nextFloat();
    	 System.out.println("Enter the length");
    	 b= sc.nextFloat();
    	 
    	 ar.setDim(l, b);
    	 System.out.println("Area of rectagle is = "+ ar.getArea());
    	 
    	 
     }
}
