import java.util.Scanner;

public class StudentMarkCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold the marks of five subjects
        int[] marks = new int[5];

        // Prompting the user to enter marks for each subject
        System.out.println("Enter the marks for 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculating the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculating the average marks
        double averageMarks = totalMarks / 5.0;

        // Displaying the results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Marks: %.2f\n", averageMarks);

        scanner.close();
    }
}
