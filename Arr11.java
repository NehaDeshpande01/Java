// to find Palindrome string from array
package NEW;
public class Arr11{
	public static void main(String[]args) {
	String [] arr  = {"nitin","nayan","ramesh","naman","madam","ganesh"};
	for(String ele : arr) {
	 if(isPalindrome(ele))// to find non Palindrome use ! operator
		 System.out.println(ele+"");
		 
	}
	}

	private static boolean isPalindrome(String ele) {
		String rev = "";
		for(int i=ele.length()-1;i>=0;i--) {
			rev += ele.charAt(i);
		}
		return ele.equals(rev);
	}
}