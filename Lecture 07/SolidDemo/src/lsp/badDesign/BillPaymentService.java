package lsp.badDesign;

public class BillPaymentService {

    public void payBill(Account account, double amount) {

        account.withdraw(amount);

        System.out.println("Bill payment successful");
    }
}
