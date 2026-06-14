// to find smallest num in array
package NEW;
import java.util.*;
class Arr7{
	public static void main(String []args) {
		int[]arr = {90,20,10,30,45,76,5,22};
		int small = arr[0];
		for(int i =0; i<arr.length;i++) {
			if (arr[i]<small) {
				small = arr[i];
			}
		}
		System.out.println(small);
	}
}