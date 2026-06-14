// combine program of arraylist on string
package NEW;
import java.util.*;
public class Arr19{
	public static void main(String[]args) {
		ArrayList<String> ceo = new ArrayList<String>();
		ceo.add("Leena Nair");
		ceo.add("Jayshree Ullal");
		ceo.add("Revathi Advaithi");
		ceo.add("Sharmistha Dubey ");
		ceo.add("Priya Nair ");
		ceo.add("Aruna Jayanthi ");
		ceo.add("Kumud Srinivasan ");
		ceo.add("Neha Narkhede ");
		ceo.add("Priya Lakhani");
		System.out.println(ceo);
		System.out.println("******************************");
		// to add new ceo
		ceo.add(3,"Suruchi Shanbhag");
		System.out.println(ceo);
		System.out.println("*******************************");
		// to get 1 ceo
		System.out.println(ceo.get(9));
		System.out.println("********************************");
		// to remove
		ceo.remove(1);
		System.out.println(ceo);
		System.out.println("********************************");
		// to find size
		System.out.println(ceo.size());
		System.out.println("*******************************");
		// to print assending order
		Collections.sort(ceo);
		for(String order: ceo) {
			System.out.println(order);
		}
	
		
	}
}