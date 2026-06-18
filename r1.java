// to get reverse number 
package NEW;
public class r1{
	public static void main(String[]args) {
		int num = 1234;
		int reverseNum = reverse(num);
		System.out.println(reverseNum);
	}public static int reverse(int num) {
		int rev =0;
		while(num != 0) {
			int rem = num%10;
		    rev = rev*10+rem;
		    num = num/10;
		}
		return rev;}}