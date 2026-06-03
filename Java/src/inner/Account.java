package inner;

public abstract class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
    private String branchName;

    Account(int accountNumber, String holderName,
            double balance, String branchName) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.branchName = branchName;
    }

    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Balance        : " + balance);
        System.out.println("Branch Name    : " + branchName);
    }


}
