package NEW;
import java.util.Scanner;
//average of two numbers
public class avg{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value of num1:");
	int num1 =sc.nextInt();
	System.out.println("enter value of num2:");
	int num2 =sc.nextInt();
	int average = (num1+num2)/2;
	System.out.println("Average of two numbers:"+average);
	
	
}
}