package oops.pack;
//Define a class called circle that contains:
//• Two  instance variables: radius (of type double) and color (of type String),
//• Initialize the variables radius and color with default value of 1.0 and "red", respectively
// using default constructor.
//• Include a second constructor that will use the default value for color and sets the value of radius to the value passed as parameter.
// Two public methods: getRadius() and getArea() for returning the radius and area of the circle.
public class circle {
double radius;
String color;

circle(){
	radius =1.0;
	color = "red";
}
public circle(double radius, String color){
	this.color = color;
	this.radius=radius;
	radius = 5.0;
}

double getRadius() {
	double r = radius;
	return r;
}

double getArea() {
	double A = 3.14*radius*radius;
	return A;
	
}
}
