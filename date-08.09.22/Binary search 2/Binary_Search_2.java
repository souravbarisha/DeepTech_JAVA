package pack.array;

public class Binary_Search_2 {
public static void searchEle(int [] arr, int search) {
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
		System.out.println("False");
	}
}
}
