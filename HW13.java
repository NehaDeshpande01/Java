//swap of first and last number
package NEW;
public class HW13{
	public static void main(String[]args) {
		int []arr= {45,67,78,89,90,23,4,12};
		int a = arr[0];
		int b = arr[7];
		int c = a;
		a=b;
		b=c;
		System.out.println("value of a first num in array after swap: "+a);
		System.out.println("Value of last num in array after swap: "+b);
	    } 
	}