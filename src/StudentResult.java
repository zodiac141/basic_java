import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        int rollno;
        int marks1;
        int marks2;
        int marks3;
        String name;
        String sub1;
        String sub2;
        String sub3;
        int total;
        float average;
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        rollno = sc.nextInt();
        System.out.println("Enter the name: ");
        name = sc.next();
        System.out.println("Enter the marks of subject 1: ");
        marks1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2: ");
        marks2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3: ");
        marks3 = sc.nextInt();
        System.out.println("Enter the name of subject 1: ");
        sub1 = sc.next();
        System.out.println("Enter the name of subject 2: ");
        sub2 = sc.next();
        System.out.println("Enter the name of subject 3: ");
        sub3 = sc.next();
        total = marks1 + marks2 + marks3;
        average = total / 3;
        if (average >= 60) {
            grade = 1;
            System.out.println("Grade: " + grade);
        } else if (average >= 50) {
            grade = 2;
            System.out.println("Grade: " + grade);
        } else {
            grade = 3;
            System.out.println("Grade: " + grade);
        }

    }
}
