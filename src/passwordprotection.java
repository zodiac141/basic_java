import java.util.Scanner;

public class passwordprotection {
    public static void main(String[] args) {
        int correct = 1234;
        int i = 1;
        while (i <= 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the password : ");
            int newpassword = sc.nextInt();
            if (newpassword == correct) {
                System.out.println("correct password");
            } else {
                System.out.println("wrong password");
            }
            i++;
            if(i > 3) {
                System.out.println("attempts over, account locked");
            }
        }
    }
}
