package oops.pack;

public class Bus extends Vehicle{
	private int routeNumber;
	Bus(String regnNumber, int speed, String color, String ownerName,int routeNumber) {
		 this.regnNumber = regnNumber;
		 this.speed = speed;
		 this.color = color;
		 this.ownerName= ownerName;
		 this.routeNumber = routeNumber;
	}
	
	void showData() {
		super.showData();
		System.out.println("Reg.No : "+regnNumber+"  speed : "+  speed +"  color : "+ color +"  owner : "+ ownerName +"  company : "+ routeNumber);
	}

}
