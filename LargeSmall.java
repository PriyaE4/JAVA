package Programs;
import java.util.*;
public class LargeSmall {
	public static void main(String[] args) {
		int arr[] = {378,23,24,34,9};
		
		/*for(int i=1; i<=4; i++) {
			int ma = Math.max(arr[i-1],arr[i]);
			int mi = Math.min(arr[i-1],arr[i]);
		}
		*/
		int max = arr[0],min = arr[0];
		for(int i=1;i<=4;i++) {
			if(max > arr[i]){
				min = arr[i];
			}
			else {
				max = arr[i];
			}
		}
		System.out.println("The smallest element is "+min+" and the largest element is "+max);
	}

}
