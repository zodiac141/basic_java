public class stringbuilderexample {
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    System.out.println(sb);
    sb.insert(0, "Hello ");
    System.out.println(sb);
    sb.replace(0, 5, "konichiwa");
    System.out.println(sb);
    sb.delete(0, 5);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.length();
    System.out.println(sb.length());
    sb.charAt(1);
    System.out.println(sb.charAt(1));
    sb.setCharAt(1, 'A');
    System.out.println(sb);
    sb.appendCodePoint(0x1F600);
    System.out.println(sb);
}
}

//Mutable → Modifies the same object instead of creating new ones.
//Not Thread-Safe → Unlike StringBuffer, StringBuilder is not synchronized, making it faster.
//Efficient → Better performance than String when dealing with large text manipulations.
//Initial Capacity → Default capacity is 16 characters, which expands as needed.
//Supports Chaining → Methods return this, allowing method chaining.
//StringBuilder sb1 = new StringBuilder(); // Default capacity = 16
//StringBuilder sb2 = new StringBuilder("Hello"); // Initializes with given string
//StringBuilder sb3 = new StringBuilder(50); // Allocates 50 characters of capacity
//Use StringBuilder instead of StringBuffer when thread safety is not required.
//Use StringBuffer when thread safety is required.
//