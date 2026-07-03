package util;

public class TransactionIdGenerator {

    private static int count = 10001;

    public static String generateTransactionId() {
        return "TXN" + count++;
    }
}