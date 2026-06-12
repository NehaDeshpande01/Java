package NEW;
import java.util.Scanner;
//check num is multiple of 555

public class multi{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter num1:");
	int num1 = sc.nextInt();
	if(num1%5==0) {
		System.out.println("num1 is muliple of 5");
	}else {
		System.out.println("num1 is not multiple of 5");
	}
}
}