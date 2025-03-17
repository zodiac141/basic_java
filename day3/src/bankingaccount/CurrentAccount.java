package bankingaccount;

public class CurrentAccount extends Account {
    private double overDraftLimit = 15000.0;

    public CurrentAccount(String customername, double balance) {
        super(customername, balance, "Current");
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void createAccount() {
        try{
            if (balance < 10000) {
                throw new InvalidOpeningBalanceException("minimum balance for current account required is 10000, current balance is " + balance + " account not created");
            } else {
                System.out.println("creating a current account for :" + customername + "with account number :" + accountnumber + "with balance :" + balance + "and overdraftlimit of :" + overDraftLimit + "%");
            }
        }
        catch (InvalidOpeningBalanceException e){
           e.printStackTrace();
        }
    }
}
