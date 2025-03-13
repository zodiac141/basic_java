import java.util.Scanner;

public class StringSubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string : ");
        String str1=sc.nextLine();
        System.out.println("enter the begin index : ");
        int beginindex=sc.nextInt();
        System.out.println("enter the final index : ");
        int finalindex=sc.nextInt();
        String s=str1.substring(beginindex,finalindex);
        System.out.println(s);

    }
}
