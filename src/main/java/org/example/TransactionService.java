package service;

import model.Transaction;

public class TransactionService {

    public void printReceipt(Transaction transaction) {

        System.out.println();
        System.out.println("========================================");
        System.out.println("         MONEY TRANSFER RECEIPT");
        System.out.println("========================================");

        System.out.println("Transaction ID : "
                + transaction.getTransactionId());

        System.out.println("UTR Number     : "
                + transaction.getUtrNumber());

        System.out.println();

        System.out.println("Date           : "
                + transaction.getTransactionDate());

        System.out.println("Time           : "
                + transaction.getTransactionTime());

        System.out.println();

        System.out.println("------------ Sender Details ------------");

        System.out.println("Bank           : "
                + transaction.getFromBank());

        System.out.println("Account No     : "
                + transaction.getFromAccountNumber());

        System.out.println("Holder Name    : "
                + transaction.getFromAccountHolder());

        System.out.println("Balance Before : ₹"
                + transaction.getFromBalanceBefore());

        System.out.println("Transferred    : ₹"
                + transaction.getAmount());

        System.out.println("Balance After  : ₹"
                + transaction.getFromBalanceAfter());

        System.out.println();

        System.out.println("----------- Receiver Details -----------");

        System.out.println("Bank           : "
                + transaction.getToBank());

        System.out.println("Account No     : "
                + transaction.getToAccountNumber());

        System.out.println("Holder Name    : "
                + transaction.getToAccountHolder());

        System.out.println("Balance Before : ₹"
                + transaction.getToBalanceBefore());

        System.out.println("Received       : ₹"
                + transaction.getAmount());

        System.out.println("Balance After  : ₹"
                + transaction.getToBalanceAfter());

        System.out.println();

        System.out.println("Status         : "
                + transaction.getStatus());

        System.out.println("Remarks        : "
                + transaction.getRemarks());

        System.out.println("========================================");
    }

}