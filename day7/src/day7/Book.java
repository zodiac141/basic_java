package day7;

import java.util.*;

public class Book {
    private int bookid;
    private String booktitle;
    private double price;

    public Book(int bookid, String booktitle, double price) {
        this.bookid = bookid;
        this.booktitle = booktitle;
        this.price = price;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return ("Book [id=" + bookid + " title=" + booktitle + " price=" + price + "]");
    }


    public static void main(String[] args) {


        List<Book> booklist = new LinkedList<>();
        booklist.add(new Book(1, "Java", 500));
        booklist.add(new Book(2, "python", 400));
        booklist.add(new Book(3, "javascript", 600));
        System.out.println(booklist);


        HashMap<Integer, Book> bookmap = new HashMap<>();
        for (Book book : booklist) {
            bookmap.put(book.getBookid(), book);
        }

        System.out.println("\nBooks stored in HashMap:");
        Set<Map.Entry<Integer, Book>> entrySet = bookmap.entrySet();
        for (Map.Entry<Integer, Book> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + " -> " + entry.getValue());

        }

    }
}





