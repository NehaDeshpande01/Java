package NEW;
import java.util.Scanner;
//check num is positive or negative
public class state2{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter num:");
	int num = sc.nextInt();
	if(num>=0) {
		System.out.println("given number is positive");
	}else {
		System.out.println("given number is negative");
	}
    
	
	
	
}
}