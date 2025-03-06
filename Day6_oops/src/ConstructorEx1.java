import java.util.Scanner;

class StudentClass {
    String name;
    int rollNo;
    String grade;

    StudentClass(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }
}

public class ConstructorEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

        System.out.println("Enter student's roll number:");
        int rollNo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter student's grade:");
        String grade = scanner.nextLine();

        StudentClass obj = new StudentClass(name, rollNo, grade);

        obj.display();
    }
}