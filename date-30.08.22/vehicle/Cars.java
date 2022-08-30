package oops.pack;

public class Cars extends Vehicle {
	private String manufacturerName;
Cars(String regnNumber, int speed, String color, String ownerName,String manufacturerName) {

		
	 this.regnNumber = regnNumber;
	 this.speed = speed;
	 this.color = color;
	 this.ownerName= ownerName;
	 this.manufacturerName=manufacturerName;
	}
void showData() {
	super.showData();
	System.out.println("Reg.No : "+regnNumber+"  speed : "+  speed +"  color : "+ color +"  owner : "+ ownerName +"  company : "+ manufacturerName);
}

}
