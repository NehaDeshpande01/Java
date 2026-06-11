// methods of string
package NEW;
public class Str{
	public static void main(String[]args) {
		String name= "neha";
		name = name.toUpperCase();
		System.out.println(name);
		String Surname = "Deshpande";
		Surname = Surname.toLowerCase();
		System.out.println(Surname);
		int len =Surname.length();
		System.out.println("length  of surname is: "+len);
		System.out.println(name.equals(Surname));
		
		
		
		
	}
}