package NEW;
public class operator{
	public static void main (String[]args) {
		//assignment operator 
		int a =5;
		a =+10;
		System.out.println("value of a: "+a);
		a=-2;
		System.out.println("value of updated a: "+a);
		a*=5;
		System.out.println("after multiplication value of a: "+a);
		
		//logical operator
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(true || true );
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(!false);
		System.out.println(!true);
		int num = 1234;
		System.out.println("Given num is : "+num);
		System.out.println(num != 0);
		System.out.println(num == 1234);
		System.out.println(num == 123);
		System.out.println(!(num!=0));
		// relational operator 
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));

		
	}
}