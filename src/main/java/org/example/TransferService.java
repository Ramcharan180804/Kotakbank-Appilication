package service;

import model.Account;
import model.Transaction;
import util.DateTimeUtil;
import util.TransactionIdGenerator;
import util.UTRGenerator;

public class TransferService {

    public Transaction transferMoney(Account sender,
                                     Account receiver,
                                     double amount) {

        // Check Balance
        if (sender.getBalance() < amount) {

            System.out.println("Insufficient Balance...");
            return null;
        }

        // Before Balances
        double senderBefore = sender.getBalance();
        double receiverBefore = receiver.getBalance();

        // Debit Sender
        sender.setBalance(sender.getBalance() - amount);

        // Credit Receiver
        receiver.setBalance(receiver.getBalance() + amount);

        // After Balances
        double senderAfter = sender.getBalance();
        double receiverAfter = receiver.getBalance();

        // Create Transaction
        Transaction transaction = new Transaction();

        transaction.setTransactionId(
                TransactionIdGenerator.generateTransactionId());

        transaction.setUtrNumber(
                UTRGenerator.generateUTR());

        transaction.setFromBank(sender.getBankName());
        transaction.setToBank(receiver.getBankName());

        transaction.setFromAccountNumber(sender.getAccountNumber());
        transaction.setToAccountNumber(receiver.getAccountNumber());

        transaction.setFromAccountHolder(sender.getAccountHolderName());
        transaction.setToAccountHolder(receiver.getAccountHolderName());

        transaction.setAmount(amount);

        transaction.setFromBalanceBefore(senderBefore);
        transaction.setFromBalanceAfter(senderAfter);

        transaction.setToBalanceBefore(receiverBefore);
        transaction.setToBalanceAfter(receiverAfter);

        transaction.setTransactionDate(
                DateTimeUtil.getCurrentDate());

        transaction.setTransactionTime(
                DateTimeUtil.getCurrentTime());

        transaction.setStatus("SUCCESS");
        transaction.setRemarks("Money Transfer Successful");

        return transaction;
    }

}