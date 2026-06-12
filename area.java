package NEW;
import java.util.Scanner;
public class area {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of radius:");
		double radius=sc.nextDouble();//area of circle 2*3.14.r.r
		System.out.println("enter value of pi:");
		double pi =sc.nextDouble();
		double ar = 2*(pi*radius*radius);
		System.out.println("area of circle is:"+ar);
		
		
	}
}