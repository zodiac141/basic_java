package bankingapplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class TransactionImps implements Transaction {

    List<Account> accounts = new ArrayList<>();

    @Override
    public Account createAccount(String customerName, double balance) {
        String accountNumber = generateAccountNumber();
        Account newAccount = new Account(accountNumber, customerName, balance);
        accounts.add(newAccount);
        System.out.println(" Account Created Successfully !: " + newAccount);
        return newAccount;
    }

/**
 * Generates a unique account number by creating a UUID, removing all non-numeric characters,
 * and ensuring the result is at least 10 digits long. If the numeric part of the UUID is
 * shorter than 10 digits, additional random digits are appended to meet the requirement.
 *
 * @return A unique 10-digit account number as a String.
 */
    private String generateAccountNumber() {
        String uuid = UUID.randomUUID().toString().replaceAll("[^0-9]", "");
        return uuid.length() >= 10 ? uuid.substring(0, 10) : uuid + (int) (Math.random() * 1000000);
    }

    /**
     * Returns the Account object with the given account number, if found.
     * Otherwise, returns null.
     *
     * @param accountNumber the account number to search for
     * @return the matching Account object, or null if not found
     */
    private Account findAccount(long accountNumber) {
        Predicate<Account> matchAccount = account -> account.getAccountNumber().equals(String.valueOf(accountNumber));
        return accounts.stream().filter(matchAccount).findFirst().orElse(null);
    }

    /**
     * Deposit the given amount into the account with the given account number.
     * <p>
     * If the account is found, the balance is increased by the given amount, and the new balance is returned.
     * If the account is not found, an AccountNotFoundException is thrown.
     *
     * @param accountNumber the account number of the account to deposit into
     * @param amount the amount to deposit
     * @return the new balance of the account
     * @throws AccountNotFoundException if the account is not found
     */
    @Override

    public double deposit(long accountNumber, double amount) {
        return Optional.ofNullable(findAccount(accountNumber))
                .map(account -> {
                    account.setBalance(account.getBalance() + amount);
                    System.out.println(" Deposit of " + amount + " at " + getCurrentTimestamp() + ". New Balance: " + account.getBalance());
                    return account.getBalance();
                })
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }

    @Override
    /**
     * Withdraws the given amount from the account with the given account number.
     *
     * If the account is found and has sufficient balance, the withdrawal is
     * successful and the new balance is returned. Otherwise, an
     * {@link InsufficientBalanceException} is thrown if the account's balance
     * is insufficient, or an {@link AccountNotFoundException} is thrown if the
     * account is not found.
     *
     * @param accountNumber the account number to withdraw from
     * @param amount the amount to withdraw
     * @return the new balance
     * @throws InsufficientBalanceException if the account's balance is insufficient
     * @throws AccountNotFoundException if the account is not found
     */
    public double withdraw(long accountNumber, double amount) {
        return Optional.ofNullable(findAccount(accountNumber))
                .map(account -> {
                    if (account.getBalance() >= amount) {
                        account.setBalance(account.getBalance() - amount);
                        System.out.println(" Withdrawal of " + amount + " at " + getCurrentTimestamp() + ". New Balance: " + account.getBalance());
                        return account.getBalance();
                    } else {
                        throw new InsufficientBalanceException("Insufficient balance");
                    }
                })
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }

    /**
     * Returns the balance of the account with the given account number.
     *
     * If the account is found, the balance of the account is returned.
     * Otherwise, an {@link AccountNotFoundException} is thrown if the account is not found.
     *
     * @param accountNumber the account number to search for
     * @return the balance of the account
     * @throws AccountNotFoundException if the account is not found
     */
    @Override
    public double checkBalance(long accountNumber) {
        return Optional.ofNullable(findAccount(accountNumber))
                .map(Account::getBalance)
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }

    /**
     * Returns the list of all accounts if the account with the given account number is found.
     *
     * If the account is found, the entire list of accounts is returned.
     * Otherwise, an {@link AccountNotFoundException} is thrown if the account is not found.
     *
     * @param accountNumber the account number to search for
     * @return the list of all Account objects
     * @throws AccountNotFoundException if the account is not found
     */
    @Override
    public List<Account> viewStatement(long accountNumber) {
        return Optional.ofNullable(findAccount(accountNumber))
                .map(account -> accounts)
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }

    private String getCurrentTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}
