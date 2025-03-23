package bankingapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;


public class TransactionImps implements Transaction {

    List<Account> accounts=new ArrayList<>();


    @Override
    public Account createAccount(String customerName, double balance) {
    Account createaccount=new Account(customerName,balance);
        accounts.add(createaccount);
        return createaccount;
    }

    private Account findAccount(long accountNumber) {
        Predicate<Account> matchaccount=account->account.getAccountNumber()
                .equals(String.valueOf(accountNumber));

        return accounts.stream()
                .filter(matchaccount)
                .findFirst()
                .orElse(null);
    }
    @Override
    public double deposit(long accountNumber, double amount) {
        return Optional.ofNullable(findAccount(accountNumber))
                .map(account -> {
                    account.setBalance(account.getBalance() + amount);
                    return account.getBalance();
                })
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }



    @Override
    public double withdraw(long accountNumber, double amount) {
         return Optional.ofNullable(findAccount(accountNumber))
                .map(account -> {
                    if (account.getBalance() >= amount) {
                        account.setBalance(account.getBalance() - amount);
                        return account.getBalance();
                    } else {
                        throw new InsufficientBalanceException("Insufficient balance");
                    }
                })
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
         }

    @Override
    public double checkBalance(long accountNumber) {
        return Optional.ofNullable(findAccount(accountNumber))
                .map(account -> account.getBalance())
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }


    @Override
    public List<Account> viewStatement(long accountNumber) {
        return Optional.ofNullable(findAccount(accountNumber))
                .map(account -> accounts)
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }
}
