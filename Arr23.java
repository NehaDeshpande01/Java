// palindrome 
package NEW;
import java.util.*;
public class Arr23 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1}; // Palindrome array

        boolean isPalindrome = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}