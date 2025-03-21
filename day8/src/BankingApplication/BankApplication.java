package BankingApplication;

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
                    System.out.println("Account created successfully");
                    System.out.println("Account Number- " + newaccount.getAccountNumber());

                    System.out.println("Account Name- " + newaccount.getCustomerName());

                    System.out.println(" balance- Rs." + newaccount.getBalance());
                    break;

                case 'd':
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    String accNumDeposit = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    double newBalance = transaction.deposit(Long.parseLong(accNumDeposit), depositAmount);
                    System.out.println("Deposit successful! New Balance: " + newBalance);

                    break;

                case 'w':
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    String accNumWithdraw = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    double withdrawBalance = transaction.withdraw(Long.parseLong(accNumWithdraw), withdrawAmount);
                    System.out.println("Withdrawal successful! New Balance: " + withdrawBalance);

                    break;

                case 'b':
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    String accNumCheck = scanner.nextLine();
                    double checkbalance = transaction.checkBalance(Long.parseLong(accNumCheck));
                    System.out.println("Current Balance: " + checkbalance);

                    break;

                case 's':
                    System.out.print("Enter Account Number: ");
                    scanner.nextLine();
                    String accNumStatement = scanner.nextLine();
                    System.out.println("Account Statement: " + transaction.viewStatement(Long.parseLong(accNumStatement)));

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