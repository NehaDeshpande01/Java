// example of constructor
package NEW;
class AC{
	public static void main(String[]args) {
		Celebrety obj = new Celebrety();
		obj.Name="Allu Arjun";
		obj.Surname="Allu";
		obj.Father="ARVIND";
		obj.Mother="Nirmala";
		obj.Wife="Sneha Reddy";
		obj.daughter="Arha";
		obj.child=2;
		obj.Son="Ayaan";
		obj.displayCelebraty();
		System.out.println("***********************");
	}
}class Celebrety{
	static String Name;
	static String Surname;
	static String Father;
	static String Mother;
	static String Wife;
	static String daughter;
	static int child;
	static String Son;
	public void displayCelebraty() {
		System.out.println("favourite celebraty");
		System.out.println("Name: "+Name);
		System.out.println("Surname: "+Surname);
		System.out.println("Father name: "+Father);
		System.out.println("Mother name: "+Mother);
		System.out.println("Wife Name: "+Wife);
		System.out.println("daughter name: "+daughter);
		System.out.println("Child: "+child);
		System.out.println("Son name: "+Son);
		
	}
}