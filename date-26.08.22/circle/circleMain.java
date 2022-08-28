package oops.pack;

public class circleMain {
public static void main (String [] args) {
	circle ci = new circle();
	circle cs = new circle();
	double radi= ci.getRadius();
	double area = ci.getArea();
	
	System.out.println("Area of "+radi +" unit of radius is : "+ area);
}
}
