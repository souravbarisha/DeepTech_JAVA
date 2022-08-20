//Write a Java program that takes a year from user and print whether that year is a leap year or not.
//
//Test Data
//Input the year: 2016
//Expected Output :
//2016 is a leap year
public class Leap_year {
public static void main (String [] args) {
	int year;
	year = 2016;
	if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)){
		System.out.println("this is leap year");
	}
	else {
		System.out.println("this is not leap year");
	}
}
}
