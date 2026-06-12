package NEW;
import java.util.Scanner;
//check year is leap or not

public class leap{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter year:");
	int year = sc.nextInt();
	if(year%4==0) {
		
	System.out.println("this is leap year");
	}else {
		System.out.println("this is not a leap year");
	}
	
}
}
