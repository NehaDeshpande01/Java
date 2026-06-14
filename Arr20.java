// combine program of array list on integer
package NEW;
import java.util.*;
public class Arr20{
	public static void main(String[]args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(34);
		num.add(56);
		num.add(78);
		num.add(12);
		num.add(23);
		System.out.println(num);
		System.out.println("****************");
		// to add num
		num.add(4,9);
		System.out.println(num);
		System.out.println("*******************");
		// to remove
		num.remove(5);
		System.out.println(num);
		System.out.println("****************");
		// find size
		System.out.println(num.size());
		System.out.println("************");
		//to get 1 num
		System.out.println(num.get(3));
		System.out.println("*************");
		// to assending order
		Collections.sort(num);
		for(int i: num) {
			System.out.println(i);
		}
		
	}
}