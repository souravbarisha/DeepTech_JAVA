package excep_hand.pack;
//Create two user-defined exceptions named “TooHot” and “TooCold” to check the
//temperature (in Celsius) given by the user passed  is too hot or too cold.
//If temperature > 35, throw exception “TooHot”.
// If temperature <5, throw exception “TooCold”.
//Otherwise, print “Normal” and convert it to Farenheit.
public class Temp {
static void CheckTemp (float tem) throws TooHot, TooCold{
	if(tem> 35) {
		throw new TooHot("it's Too Hot");
	}
	else if(tem < 5) {
		throw new TooCold("it's Too Cold");
	}
	
	else {
		System.out.println("It's normal temperature");
//		°F = °C × (9/5) + 32
		
		System.out.println("Temperarture in farenheit is : "+ (tem*(9/5)+32));
		
	}
}
}
