//exception handling example
package NEW
;
import java.util.Scanner;
class Ex01{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a: ");
		int a = sc.nextInt();
		System.out.println("enter value of b: ");
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception is handling");
		}
		
	}
}