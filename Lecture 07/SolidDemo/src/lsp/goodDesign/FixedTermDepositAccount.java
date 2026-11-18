package lsp.goodDesign;

public class FixedTermDepositAccount  implements BankAccount {

    private double balance;

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Invalid deposit amount"
            );
        }

        balance+=amount;

        System.out.println("Deposit successful: " + amount);
    }

    // No Withdrawal allowed
}
