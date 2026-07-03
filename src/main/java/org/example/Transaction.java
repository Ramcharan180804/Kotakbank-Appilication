package model;

public class Transaction {

    private String transactionId;
    private String utrNumber;

    private String fromBank;
    private String toBank;

    private String fromAccountNumber;
    private String toAccountNumber;

    private String fromAccountHolder;
    private String toAccountHolder;

    private double amount;

    private double fromBalanceBefore;
    private double fromBalanceAfter;

    private double toBalanceBefore;
    private double toBalanceAfter;

    private String transactionDate;
    private String transactionTime;

    private String status;
    private String remarks;

    public Transaction() {
    }

    public Transaction(String transactionId, String utrNumber,
                       String fromBank, String toBank,
                       String fromAccountNumber, String toAccountNumber,
                       String fromAccountHolder, String toAccountHolder,
                       double amount,
                       double fromBalanceBefore, double fromBalanceAfter,
                       double toBalanceBefore, double toBalanceAfter,
                       String transactionDate, String transactionTime,
                       String status, String remarks) {

        this.transactionId = transactionId;
        this.utrNumber = utrNumber;
        this.fromBank = fromBank;
        this.toBank = toBank;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.fromAccountHolder = fromAccountHolder;
        this.toAccountHolder = toAccountHolder;
        this.amount = amount;
        this.fromBalanceBefore = fromBalanceBefore;
        this.fromBalanceAfter = fromBalanceAfter;
        this.toBalanceBefore = toBalanceBefore;
        this.toBalanceAfter = toBalanceAfter;
        this.transactionDate = transactionDate;
        this.transactionTime = transactionTime;
        this.status = status;
        this.remarks = remarks;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUtrNumber() {
        return utrNumber;
    }

    public void setUtrNumber(String utrNumber) {
        this.utrNumber = utrNumber;
    }

    public String getFromBank() {
        return fromBank;
    }

    public void setFromBank(String fromBank) {
        this.fromBank = fromBank;
    }

    public String getToBank() {
        return toBank;
    }

    public void setToBank(String toBank) {
        this.toBank = toBank;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public String getFromAccountHolder() {
        return fromAccountHolder;
    }

    public void setFromAccountHolder(String fromAccountHolder) {
        this.fromAccountHolder = fromAccountHolder;
    }

    public String getToAccountHolder() {
        return toAccountHolder;
    }

    public void setToAccountHolder(String toAccountHolder) {
        this.toAccountHolder = toAccountHolder;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getFromBalanceBefore() {
        return fromBalanceBefore;
    }

    public void setFromBalanceBefore(double fromBalanceBefore) {
        this.fromBalanceBefore = fromBalanceBefore;
    }

    public double getFromBalanceAfter() {
        return fromBalanceAfter;
    }

    public void setFromBalanceAfter(double fromBalanceAfter) {
        this.fromBalanceAfter = fromBalanceAfter;
    }

    public double getToBalanceBefore() {
        return toBalanceBefore;
    }

    public void setToBalanceBefore(double toBalanceBefore) {
        this.toBalanceBefore = toBalanceBefore;
    }

    public double getToBalanceAfter() {
        return toBalanceAfter;
    }

    public void setToBalanceAfter(double toBalanceAfter) {
        this.toBalanceAfter = toBalanceAfter;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", utrNumber='" + utrNumber + '\'' +
                ", fromBank='" + fromBank + '\'' +
                ", toBank='" + toBank + '\'' +
                ", fromAccountNumber='" + fromAccountNumber + '\'' +
                ", toAccountNumber='" + toAccountNumber + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}