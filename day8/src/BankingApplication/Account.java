package BankingApplication;

import java.util.UUID;
//used UUID for unique account number for each customer which is generated automatically by the system and is secure.

class Account {
    private final String accountNumber;
    private String customerName;
    private double balance;

    public Account(String customerName, double balance) {
        this.accountNumber = generateNumericAccountNumber();
        this.customerName = customerName;
        this.balance = balance;
    }
    private String generateNumericAccountNumber() {
        String uuid = UUID.randomUUID().toString().replaceAll("[^0-9]", "");
        if (uuid.length() < 10) {

            uuid += String.valueOf((int) (Math.random() * 1000000));
        }
        return uuid.substring(0, 10);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
