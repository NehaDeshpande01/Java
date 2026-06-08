package NEW;

import java.util.Scanner;
public class Arith{
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a value of a: ");
		int a = sc.nextInt();
		System.out.println("enter a value of b: ");
		int b = sc.nextInt();
		int d= a+b;
		System.out.println("value of d " +d);
		int e = a-b;
		System.out.println("value of e "+e);
		int f = a*b;
		System.out.println("value of f " +f);
		double g = a/b;
		System.out.println("value of g "+g);
		
		
		
		
	}
}
