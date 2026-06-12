package NEW;
import java.util.Scanner;
//average of two numbers
public class avg1{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter value of num1:");
	int num1 =sc.nextInt();
	System.out.println("enter value of num2:");
	int num2 =sc.nextInt();
	System.out.println("enter value of num3:");
	int num3 =sc.nextInt();
	double average = (num1+num2+num3)/3;
	System.out.println("average of three numbers is :"+average);
	
	
}
}