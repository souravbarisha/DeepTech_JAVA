package oops.pack;
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
//by creating a class named 'Triangle' without any parameter in its constructor.
public class Triangle {
 int x,y,z;
 Triangle(){
	 x=3;
	 y=4;
	 z=5;
 }
 float area() {
	 return (y*z)/2;
 }
 int perimeter() {
	 int p= x+y+z;
	 return p;
 }
}
