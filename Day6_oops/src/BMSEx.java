import java.util.Scanner;

class BMS {
    String accountholder;
    int accountnumber;
    int balance;

    BMS(String accountholder, int accountnumber, int balance) {
        this.accountholder = accountholder;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder: " + accountholder);
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Balance: Rs." + balance);
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount + ". New balance: Rs." + balance);
    }


    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount + ". New balance: Rs." + balance);
        }
    }
}
    public class BMSEx {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to Bank Management System:");
            System.out.println("Press 1 to open an account");
            System.out.println("Press 2 to close an account");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter account holder name:");
                String accountholder = scanner.nextLine();
                scanner.nextLine();

                System.out.println("Enter account number:");
                int accountnumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter initial balance:");
                int balance = scanner.nextInt();
                scanner.nextLine();

                BMS account1 = new BMS(accountholder, accountnumber, balance);
                account1.display();
                System.out.println("Press 4 for depositing amount or press 5 for withdrawing money:");
                int option = scanner.nextInt();
                if (option == 4) {
                    System.out.println("Enter the amount to deposit");
                    int depositAmount = scanner.nextInt();
                    account1.deposit(depositAmount);
                    System.out.println("Thank you for choosing BMS");
                } else if (option == 5) {
                    System.out.println("Enter the amount to withdraw:");
                    int withdrawAmount = scanner.nextInt();
                    account1.withdraw(withdrawAmount);
                    System.out.println("Thank you for choosing BMS");
                }
                } else if (choice == 2) {
                    System.out.println("Thank you for choosing BMS");
            }

        }
        }



