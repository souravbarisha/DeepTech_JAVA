package oops1.pack;

public class Carthat extends MotorVehicle {
	double discountRate;
	String car_name;
	public Carthat(String cn,double disRate){
	 super("ultra","1538 AT",25000.0);
	 this.car_name = cn;
	this.discountRate = disRate;
		
		
	}
	

	



	void display() {
		System.out.println("Car name: "+car_name+",  Model anme: "+modelNumbe+", Model price: "+modelPrice+", DiscountRate: "+discountRate);
		
	}
   
	 void Discount() {
		System.out.println(" Total Discount is : "+ ( modelPrice - discountRate * modelPrice ));
	}





}
