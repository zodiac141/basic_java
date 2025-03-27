package bankingapplication;

import java.time.LocalDateTime;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Transaction transaction = new TransactionImps();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("c - Create Account");
            System.out.println("d - Deposit");
            System.out.println("w - Withdraw");
            System.out.println("b - Check Balance");
            System.out.println("s - View Statement");
            System.out.println("x - Exit");
            System.out.println("Enter your choice");
            char choice = scanner.next().charAt(0);
            switch (choice) {
                case 'c':
                    System.out.println("Enter your name");
                    scanner.nextLine();
                    String name = scanner.next();
                    System.out.println("Enter your balance");
                    scanner.nextLine();
                    double balance = scanner.nextDouble();
                    Account newaccount=transaction.createAccount(name,balance);
                    break;

                case 'd':
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    String accNumDeposit = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    double newBalance = transaction.deposit(Long.parseLong(accNumDeposit), depositAmount);
                    break;

                case 'w':
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    String accNumWithdraw = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    double withdrawBalance = transaction.withdraw(Long.parseLong(accNumWithdraw), withdrawAmount);
                    break;

                case 'b':
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    String accNumCheck = scanner.nextLine();
                    double checkbalance = transaction.checkBalance(Long.parseLong(accNumCheck));
                    break;

                case 's':
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    String accNumStatement = scanner.nextLine();

                    break;

                case 'x':
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}