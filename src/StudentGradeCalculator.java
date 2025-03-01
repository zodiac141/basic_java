import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student marks (0-100): ");
        int marks = scanner.nextInt();
        String grade;

        switch (marks / 10) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "Fail";
                break;
            case 5:
                grade = "E";
                break;
        }
        System.out.println("Student Grade: " + grade);
        scanner.close();
    }
}
