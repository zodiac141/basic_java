import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();

        String temp = str1;
        str1 = str2;
        str2 =temp;

        System.out.println("After Swapping :");

        System.out.println("String 1 :"+str1);

        System.out.println("String 2 :"+str2);

    }
}
