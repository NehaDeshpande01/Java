// to find sum of odd num to the given number
package NEW;
import java.util.Scanner;
public class Uod1{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int num= sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=num) {
			if(i%2!=0) {
				sum = sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}
}