package NEW;
import java.util.Scanner;

public class Demof1 {
	double average;
 static int sum;
    public static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubject = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] names = new String[numSubject];
        int[] marks = new int[numSubject];
        String[] grades = new String[numSubject];

        for (int i = 0; i < numSubject; i++) {
            System.out.println("\nSubject " + (i + 1) + ":");
            System.out.print("Enter name: ");
            names[i] = scanner.nextLine();
            System.out.print("Enter marks (0-100): ");
            marks[i] = scanner.nextInt();
            scanner.nextLine(); // consume newline
            sum += marks[i];
        }
        double average =sum/numSubject;
        System.out.println("\n--- Grade Report ---");
        for (int i = 0; i < numSubject; i++) {
            System.out.println(names[i] + " - Marks: " + marks[i] + " - Grade: " + grades[i]);
        }

        scanner.close();
    }
}