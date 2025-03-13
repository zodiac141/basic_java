import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String str=sc.nextLine();
        String rev="";
        StringBuilder sb=new StringBuilder(str);
        rev=sb.reverse().toString();
        if(str.equals(rev))
        {
            System.out.println("the string is palindromic");
        } else {
            System.out.println("the string is not palindromic");
        }
    }
}
