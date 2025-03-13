import java.util.Arrays;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        str = Arrays.toString(str.toCharArray());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a','e','i','o','u':
                    count++;
                    System.out.println("these are the vowels " + ch);
                    break;

                default:
                    System.out.println("not a vowel");
            }
        }
        System.out.println("no of vowels in the string are " + count);
    }
}

