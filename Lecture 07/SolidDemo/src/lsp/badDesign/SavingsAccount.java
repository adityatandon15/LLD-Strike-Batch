package lsp.badDesign;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0 || amount > balance) {

            throw new IllegalArgumentException(
                    "Invalid withdrawal amount"
            );
        }

        balance-=amount;

        System.out.println("Withdrawal successful: " + amount);
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
}
