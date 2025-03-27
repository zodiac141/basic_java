package bankingapplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Account {
    private final String accountNumber;
    private String customerName;
    private double balance;
    private final String datentime;

    public Account(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
        this.datentime = getCurrentTimestamp();
    }

    /**
     * Returns the current timestamp as a formatted string.
     * The format used is "yyyy-MM-dd HH:mm:ss".
     *
     * @return the current timestamp in the specified format
     */
    private String getCurrentTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
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

    public String DateNTime() {
        return datentime;
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
                ", creationTime='" + datentime + '\'' +
                '}';
    }
}
