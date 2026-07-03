package model;

public class Bank {

    private String bankName;
    private String ifscCode;
    private String branchName;

    public Bank() {
    }

    public Bank(String bankName, String ifscCode, String branchName) {
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}