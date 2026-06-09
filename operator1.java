package NEW;
import java.util.Scanner;
public class operator1{
	public static void main (String[]args) {
		//conditional operator
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of m: ");
		int num  = sc.nextInt();
		String result = (num%2<=0)? ("even"): ("odd");
		System.out.println("result is: " +result);
		
	}
}
