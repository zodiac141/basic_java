import java.util.Scanner;

class BookClass {
    String title;
    String author;
    int price;

    BookClass(String title, String author, int price) {
       this.title=title;
       this.author=author;
       this.price=price;
    }
    BookClass (BookClass copyBook) {
        this.title=copyBook.title;
        this.author=copyBook.author;
        this.price=copyBook.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}


public class ConstructorEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter book price:");
        int price = scanner.nextInt();
        scanner.nextLine();
    BookClass original = new BookClass(title, author, price);
        System.out.println("original book details:");
        original.display();

        BookClass copy = new BookClass(original);
        System.out.println("copy book details:");
        copy.display();

    }
}