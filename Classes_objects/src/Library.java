public class Library extends Student {
    private int bookdue;

    public Library(int rollNo, String name, String dept, int bookdue) {
        super(rollNo, name, dept);
        this.bookdue = bookdue;
    }
     void ShowDetails(){
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Department: " + dept + ", Book Due: " + bookdue);
    }


    public static void main(String[] args) {
        Library library = new Library(11, "Faraan", "ECE", 2);
        library.ShowDetails();
        library.display();
    }
}


