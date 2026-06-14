package NEW;
import java.util.*;
public class Arsum{
	public static void main(String[]args) {
		int[]arr= {21,43,43,21};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}System.out.println("sum is: "+sum);
	}
}