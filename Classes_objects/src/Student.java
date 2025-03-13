public class Student {
    protected int rollNo;
    protected String name;
    protected String dept;

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", dept: " + dept);
    }
    public Student(int rollNo, String name, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
    }
}
