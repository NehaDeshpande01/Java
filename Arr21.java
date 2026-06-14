// example of hash map
package NEW;
import java.util.*;
public class Arr21{
	public static void main(String[]args) {
		HashMap<String,Integer> obj =  new HashMap<>();
		obj.put("Neha ",1);
		obj.put("Bharati ",13);
		obj.put("Snehal ",48);
		obj.put("Nmrata ",20);

		for(String i: obj.keySet()) {
			System.out.println("key: "+i+"and value: "+obj.get(i));
		}
		
	}
}