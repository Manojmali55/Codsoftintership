import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Input - Taking marks obtained in each subject
        Scanner scanner = new Scanner(System.in);
        
        // Define number of subjects
        int numSubjects = 7; // You can change the value based on the number of subjects
        int[] marks = new int[numSubjects];
        
        System.out.println("Enter marks obtained in " + numSubjects + " subjects (out of 100 per): ");
        int totalMarks = 0;
        
        // Get marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i]; // Sum up the marks for total marks
        }
        
        //  Calculate Total Marks (Already done above in totalMarks)
        
        //  Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;
        
        //Grade Calculation based on the average percentage
        String grade = "";
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B+";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }
        
        // Step 5: Display Result
        System.out.println("\n--- Student's Result ---");
        System.out.println("Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        // Close the scanner object to avoid memory leak
        scanner.close();
    }
}
