package bankingaccount;

public class CurrentAccount extends Account {
    private double overDraftLimit = 15000.0;

    public CurrentAccount(String customername, double balance) {
        super(customername, balance, "Current");
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void createAccount() {
        if (balance < 10000) {
            System.out.println("minimum balance not met, account not created");
        } else {
            System.out.println("creating a current account for :" + customername + "with account number :" + accountnumber + "with balance :" + balance + "and overdraftlimit of :" + overDraftLimit + "%");

        }
    }
}
