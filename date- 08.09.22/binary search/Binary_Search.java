package pack.array;

public class Binary_Search {
public static void main (String []args) {
	int [] arr = {2,5,7,9,12,14,16,17,19,22,24,28,30};
	int search = 12;
	int li =0;
	int hi=arr.length-1;
	int mi = (li+hi)/2;
	while(li<=hi) {
		
		if(arr[mi]== search) {
			System.out.println("element is there in position of  "+mi);
			break;
			
		}
		else if(arr[mi]<search) {
			li = mi +1;
			
		}
		else {
			hi = mi-1;
			
		}
		
		mi= (li+hi)/2;
	}
	
	if(li>hi) {
		System.out.println("element not found");
	}
}
}
