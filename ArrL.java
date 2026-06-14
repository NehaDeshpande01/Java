// to find largest num
package NEW;
import java.util.*;
public class ArrL{
	public static void main(String[]args) {
		int[]arr= {23,45,56,78,89,90,54};
		int large=arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
		}
		System.out.println(large);
	}
}