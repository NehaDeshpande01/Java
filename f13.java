package NEW;
import java.util.*;
public class f13{
	public static String gradecalsi(int marks) {
		if(marks>=90) return "A";
			else if(marks>=80) return "B";
			else if(marks>=70) return "C";
			else if(marks>=60) return "D";	
		    else return "F";
		}
	
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of marks: ");
		int count = sc.nextInt();
		System.out.println();
		int [] marks = new int [count];
		for(int i=0;i<count;i++) {
			System.out.println("enter marks "+(i+1)+":");
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<count;i++) {
			String grade = gradecalsi(marks[i]);
			System.out.println("mark "+(i+1)+ " : " +marks[i] +" = Grade" +grade);
		}
		}
	}


