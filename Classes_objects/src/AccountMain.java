public class AccountMain {
    public static void main(String[] args) {
        AccountDetails acnt=new AccountDetails();
        acnt.setName("Faraan");
        acnt.setAccountNumber("123456");
        acnt.setBalance(5000);
        System.out.println("Name :"+acnt.getName());
        System.out.println("Account Number :"+acnt.getAccountNumber());
        System.out.println("Balance :"+acnt.getBalance());
    }
}

