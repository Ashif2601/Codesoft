import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();
        int totalMarks = 0;

        for(int i=1; i<= subjects; i++){
            System.out.print("Enter marks for Subjects " + i + " (out of 100): ");
            int marks = sc.nextInt();

            while(marks < 0 || marks > 100){
                System.out.println("Invalid input! Marks must be between 0 and 100.");
                System.out.println("Re- enter marks for Subject " + i + ": ");
                marks = sc.nextInt();
            }
            totalMarks += marks;
        }
        double average = (double) totalMarks / subjects;

        String grade;
        if(average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("RESULT");
        System.out.println("----------------------");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", average) + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
