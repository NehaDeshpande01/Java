// paste two arrays in third array
package NEW;
import java.util.*;
public class Arr26{
	public static void main(String[]args) {
		int[]arr1= {1,23,45,6,78,9};
		int[]arr2= {12,34,56,89};
		Object[]arr3= {arr1.length+arr2.length};
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3);
			
		}
		System.out.println(Arrays.deepToString(arr3));
		
	}
}