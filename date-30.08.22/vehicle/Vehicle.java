package oops.pack;
//Write a program to create a class named Vehicle having protected instance variables
//regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
//vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
//individual private instance variables routeNumber in Bus and manufacturerName in Car
//and both of them having showData ( ) method showing all details of Bus and Car
//respectively with content of the super class’s showData ( ) method.
public class Vehicle {
	protected String regnNumber;
	protected int speed;
	protected String color;
	protected String ownerName;
	


	 void showData() {
		 System.out.println("This is a vehicle class");
	 }
}
