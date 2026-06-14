// to print assending order
package NEW;
import java.util.*;
class Arr17{
	public static void main(String[]args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(23);
		num.add(89);
		num.add(67);
		num.add(54);
		System.out.println(num);
		
		
		Collections.sort(num);
		for(int ele: num)
		{
			System.out.println(ele);
		}
		
	}
}