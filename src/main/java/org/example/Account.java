package model;

public class Account {

    private String accountNumber;
    private String accountHolderName;
    private String bankName;
    private double balance;

    public Account() {
    }

    public Account(String accountNumber, String accountHolderName,
                   String bankName, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", balance=" + balance +
                '}';
    }
}