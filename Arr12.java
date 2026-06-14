// to find sum  number of array
package NEW;
import java.util.*;
public class Arr12{
	public static void main(String[]args) {
		 int[] array1 = {1, 2, 3, 4};
		 int[] array2 = {5, 6, 7, 8};
		 int[] sumArray = new int[array1.length];
		 for (int i = 0; i < array1.length; i++) {
		        sumArray[i] = array1[i] + array2[i];
		    }
		System.out.println("add is:"+sumArray);
		
		
		
	}
}