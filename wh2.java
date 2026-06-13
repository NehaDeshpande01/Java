
package NEW; 

//While loop to print a reversed number
public class wh2 { 
 public static void main(String[] args) { 
     int i = 1234; 
     int rev = 0; 
     
     while (i > 0) { // Condition fixed from >= to >
         int rem = i % 10; 
         rev = rev * 10 + rem; 
         i = i / 10; 
     } 
     
     System.out.println(rev); // Outputs: 4321
 } 
}
