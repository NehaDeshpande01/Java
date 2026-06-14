// Anagram
package NEW;
import java.util.*;
public class Arr27{
	public static void main(String[]args) {
		String str="silent";
		String str1 = "listen";
		char [] ch1 = str.toCharArray();
		char[]ch2=str1.toCharArray();
		/* System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));*/
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		boolean b= Arrays.equals(ch1, ch2);
		if(b)
			System.out.println(" it is Anagram");
		else
			System.out.println("it is not Anagram");
	}
}