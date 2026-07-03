import model.Account;
import model.Bank;
import model.Transaction;
import service.AccountService;
import service.BankService;
import service.TransactionService;
import service.TransferService;

public class Main {

    public static void main(String[] args) {

        // Create Banks
        Bank sbi = new Bank("SBI", "SBIN0001234", "Hyderabad");
        Bank hdfc = new Bank("HDFC", "HDFC0005678", "Vijayawada");

        // Create Accounts
        Account sender = new Account(
                "1234567890",
                "Ram",
                sbi.getBankName(),
                50000
        );

        Account receiver = new Account(
                "9876543210",
                "Charan",
                hdfc.getBankName(),
                20000
        );

        // Create Services
        BankService bankService = new BankService();
        AccountService accountService = new AccountService();
        TransferService transferService = new TransferService();
        TransactionService transactionService = new TransactionService();

        // Display Bank Details
        System.out.println("===== BANK DETAILS =====");
        bankService.displayBank(sbi);
        bankService.displayBank(hdfc);

        // Check Initial Balance
        System.out.println("\n===== BEFORE TRANSFER =====");
        accountService.checkBalance(sender);
        accountService.checkBalance(receiver);

        // Transfer Money
        double amount = 5000;

        Transaction transaction =
                transferService.transferMoney(sender, receiver, amount);

        if (transaction != null) {

            // Check Final Balance
            System.out.println("\n===== AFTER TRANSFER =====");
            accountService.checkBalance(sender);
            accountService.checkBalance(receiver);

            // Print Receipt
            transactionService.printReceipt(transaction);

        } else {

            System.out.println("Transaction Failed...");
            System.out.println("Ramcharan");
        }

    }
}
