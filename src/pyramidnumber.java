import java.util.Scanner;

public class pyramidnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        int n=sc.nextInt();
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}



