// to assending order of string
package NEW;
import java.util.*;
public class Arr18{
	public static void main(String[]args) {
		ArrayList<String> str =  new ArrayList<>();
		str.add("Neha");
		str.add("Chaitanya");
		str.add("Prasad");
		str.add("Manisha");
		System.out.println(str);
		Collections.sort(str);
		for(String str1: str) {
			System.out.println(str1);
		}
	}
}