package oops.pack;
//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods
//to print the area and perimeter of the rectangle respectively. Its constructor having parameters
//for length and breadth is used to initialize length and breadth of the rectangle. 
//Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for 
//its side (suppose s) calling the constructor of its parent class as 'super(s,s)'.
//Print the area and perimeter of a rectangle and a sq square.

public class Rectangle {
  int length;
  int breadth;
  Rectangle(int length,int breadth){
	  this.length =length;
	  this.breadth =breadth;
  }
  
  void area() {
	  int area_Rec = this.length * this.breadth;
	  System.out.println("Area of rectangle is : "+area_Rec);
	  
  }
  void perimeter() {
	  int pere_Rec = 2 * (this.length + this.breadth);
	  System.out.println("Perimeter of rectangle is : "+pere_Rec);
  }
}
