package excep_hand.pack;

public class TempMain {
public static void main(String [] args) {
	try {
		Temp.CheckTemp(4);
	}
	catch(TooHot p) {
    System.out.print(p.getMessage());		
	}
	catch(TooCold q) {
		 System.out.print(q.getMessage());
	}
}
}
