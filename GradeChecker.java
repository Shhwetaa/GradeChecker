import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks (out of 100): ");
        int marks = sc.nextInt();

        String grade;
        if (marks >= 90) grade = "A";         
                                            
        else if (marks >= 75) grade = "B";
        else if (marks >= 60) grade = "C";
        else grade = "Fail";

        System.out.println("\n--- Result ---");
        System.out.println("Name : " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}