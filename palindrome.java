package NEW; 

//While loop to print a palindrome number
public class palindrome { 
 public static void main(String[] args) { 
     int i = 11211; 
     int temp =i;
     int rev = 0; 
     
     while (i > 0) { // Condition fixed from >= to >
         int rem = i % 10; 
         rev = rev * 10 + rem; 
         i = i / 10; 
     } 
     
     System.out.println(rev); // Outputs: 4321
     if(temp==rev) {
    	 System.out.println("it is palindrome");
     }else {
    	 System.out.println("it is not a palindrome");
     }
 } 
}