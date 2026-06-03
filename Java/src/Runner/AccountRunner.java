package Runner;

public class AccountRunner {
    public static void main(String[] args) {
        SavingsAccount account =
                new SavingsAccount(12345,
                        "Spandana",
                        25000.0,
                        "Bangalore");

        account.displayAccountDetails();
    }
}
