// armstrong no
package NEW;
import java.util.Scanner;
public class Armstrong11{
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a value");
		int num = sc.nextInt();
		int res = 0;
		int temp = num;
		while(num>=0) {
			int rem = num%10;
			res = (res+(rem*rem*rem));
			num = num/10;
		}
		System.out.println(res);
		if(temp==res) {
			System.out.println("it is armstrong");
			
		}else {
			System.out.println("it is not armastrong");
		}
	}
}