package NEW;
import java.util.*;
public class pro1{
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
	        int sum = 0;
	        System.out.print("Enter number of subjects: ");
	        int num = sc.nextInt();
	        sc.nextLine(); 

	        String[] names = new String[num];
	        int[] marks = new int[num];
	        String[] grades = new String[num];

	        for (int i = 0; i < num; i++) {
	            System.out.println("\nSubject " + (i + 1) );
	            System.out.print("Enter name: ");
	            names[i] = sc.nextLine();
	            System.out.print("Enter marks: ");
	            marks[i] = sc.nextInt();
	            sc.nextLine(); // consume newline
	            sum += marks[i];
	    }
	    double average=sum/num;
	    System.out.println("Average marks: "+average);
	    if(average>=85) {
	    	System.out.println("grade is A");
	    }else if(average>=75){
	    	System.out.println("grade is B");
	    }else if(average>=65){
	    	System.out.println("grade is C");
	    }else if(average>=55) {
	    	System.out.println("grade is D");
	    }else {
	    	System.out.println("grade is F");
	    }
	  
	    }
	}
