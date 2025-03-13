package bankingaccount;

abstract class Account {
    protected long accountnumber=1234467;
    protected String customername;
    protected double balance;
    protected String accounttype;

    public Account(String customername, double balance, String accounttype) {
        this.customername = customername;
        this.balance = balance;
        this.accounttype = accounttype;
    }
     abstract void createAccount();
     }



