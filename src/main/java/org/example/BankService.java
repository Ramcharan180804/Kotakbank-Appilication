package service;

import model.Bank;

public class BankService {

    public void displayBank(Bank bank) {

        System.out.println("---------------------------");
        System.out.println("Bank Name : " + bank.getBankName());
        System.out.println("IFSC Code : " + bank.getIfscCode());
        System.out.println("Branch    : " + bank.getBranchName());
        System.out.println("---------------------------");

    }

}