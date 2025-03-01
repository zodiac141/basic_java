import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number : ");
        int n=sc.nextInt();
        System.out.println("enter the second number : ");
        int m=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
