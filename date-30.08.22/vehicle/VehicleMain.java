package oops.pack;

public class VehicleMain {
public static void main (String [] args) {
	
	Bus b = new Bus("WB32B7254",80,"GREY","GREENLINE",503785);
	Cars c = new Cars("WB34C1122",120,"RED","SOURAV","TATA");
	
	b.showData();
	c.showData();
	}
}
