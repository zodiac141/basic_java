package bankingaccount;

public class SavingsAccount extends Account {
    private double interestRate = 2;

    public SavingsAccount(String customername, double balance) {
        super(customername, balance, "Savings");
    }


    @Override
    public void createAccount() {
        try {
            if (balance < 5000) {
                throw new InvalidOpeningBalanceException("minimum balance for savings required is 5000, current balance is " + balance + " account not created");
            } else {
                System.out.println("creating a savings account for :" + customername + " with account number :" + accountnumber + " with balance :" + balance + " and interest rate :" + interestRate + "%");
            }
        }
        catch(InvalidOpeningBalanceException e){

                e.printStackTrace();
            }

    }
}
