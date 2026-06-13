package NEW;
import java.util.Scanner;
//check character has vowel or not
public class vowel{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("enter alphabate:");
    char alpha = sc.next().charAt(0);
    switch(alpha) {
    case 'a':
    	 System.out.println("it is vowel");
    	 break;
    case 'e':
    	 System.out.println("it is vowel");
    	 break;
    case 'i':
    	 System.out.println("it is vowel");
    	 break;
    case 'o':
    	 System.out.println("it is vowel");
    	 break;
    case 'u':
    	 System.out.println("it is vowel");
    	break;
    default:
    	 System.out.println("it is consonent");
    }
}
}