package service;

import model.Account;

public class AccountService {

    public void deposit(Account account, double amount) {

        account.setBalance(account.getBalance() + amount);

        System.out.println("Deposit Successful...");
        System.out.println("Current Balance : ₹" + account.getBalance());
    }

    public void withdraw(Account account, double amount) {

        if (account.getBalance() >= amount) {

            account.setBalance(account.getBalance() - amount);

            System.out.println("Withdraw Successful...");
            System.out.println("Current Balance : ₹" + account.getBalance());

        } else {

            System.out.println("Insufficient Balance...");
        }
    }

    public void checkBalance(Account account) {

        System.out.println("------------------------------");
        System.out.println("Account Holder : " + account.getAccountHolderName());
        System.out.println("Bank           : " + account.getBankName());
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Balance        : ₹" + account.getBalance());
        System.out.println("------------------------------");
    }
}