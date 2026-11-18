package lsp.badDesign;

public class FixedTermDepositAccount extends Account {

    public FixedTermDepositAccount(double balance) {
        super(balance);
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

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException(
                "Withdrawal is not allowed before maturity"
        );
    }
}
