// array list
package NEW;
import java.util.*;
class Arr16{
	public static void main(String[]args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Farrari");
		obj.add("Rolls Royas");
		obj.add("Ola");
		obj.add("KIA");
		obj.add("Lamborghini");
		System.out.println(obj);
		
		System.out.println("*************");
		// to add 
		obj.add(4,"Ford");
		System.out.println(obj);
		System.out.println("*************");
		// to print one car
		System.out.println(obj.get(3));
		System.out.println("*************");
		// to remove
		obj.remove(2);
		System.out.println(obj);
		System.out.println("**************");
		System.out.println(obj.size());
	}
	
}