package bankingaccount;

import java.util.Scanner;

public class BankingApplication {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the account type");
        String accounttype = scanner.nextLine();
       if(accounttype.equals("Savings")){
           SavingsAccount account=new SavingsAccount("Faraan",700);
           account.createAccount();
       }else if(accounttype.equals("Current")){
           CurrentAccount account=new CurrentAccount("Faraan",800);
           account.createAccount();
       }

    }
}
