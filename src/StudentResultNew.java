public class StudentResultNew {
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

    void studentresult(int rollno, String name, int marks1, int marks2, int marks3, String sub1, String sub2, String sub3){
        this.rollno=rollno;
        this.name=name;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.total=marks1+marks2+marks3;
        this.average=(float)total/3;
        if(average>=60)
            this.grade='A';
        else if(average>=50)
            this.grade='B';
        else
            this.grade='C';
    }

    void display(){
        System.out.println("Roll No: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Marks in "+sub1+": "+marks1);
        System.out.println("Marks in "+sub2+": "+marks2);
        System.out.println("Marks in "+sub3+": "+marks3);
        System.out.println("Total: "+total);
        System.out.println("Average: "+average);
        System.out.println("Grade: "+grade);
    }
    public static void main(String[] args) {
        StudentResultNew obj=new StudentResultNew();
        obj.studentresult(1, "Rohan", 80, 90, 70, "Maths", "Science", "English");
        obj.display();
    }
}
