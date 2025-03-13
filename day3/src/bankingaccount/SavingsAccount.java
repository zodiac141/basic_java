package bankingaccount;

public class SavingsAccount extends Account {
    private double interestRate = 2;

    public SavingsAccount(String customername, double balance) {
        super(customername, balance, "Savings");
    }


    @Override
    public void createAccount() {
        if (balance < 5000) {
            System.out.println("minimum balance not met, account not created");
        } else {
            System.out.println("creating a savings account for :" + customername + " with account number :" + accountnumber + " with balance :" + balance + " and interest rate :" + interestRate + "%");

        }
    }
}
