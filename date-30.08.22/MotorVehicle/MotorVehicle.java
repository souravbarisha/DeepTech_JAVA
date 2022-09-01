package oops1.pack;
//.Create an abstract class MotorVehicle with the following details:
//Data Members:
//(a) modelName (b)modelNumber (c) modelPrice
//Methods:
//(a) display() to show all the details
//Create a subclass of this class Carthat inherits the class MotorVehicle and add the
//following details:
//Data Members:
//(b) discountRate
//Methods:
//(a) display() method to display the Car name, model number, price and the discount
//rate.
//(b) discount() method to compute the discount.
public abstract class MotorVehicle {
 String modelName;
 String modelNumbe;
 double modelPrice;
 MotorVehicle( String mNA,String mNO,double mP){
	 this.modelName= mNA;
	 this.modelNumbe= mNO;
	 this.modelPrice = mP;
 }
  abstract void display();
}
