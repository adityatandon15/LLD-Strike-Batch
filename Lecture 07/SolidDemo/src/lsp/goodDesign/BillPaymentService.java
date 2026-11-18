package lsp.goodDesign;

public class BillPaymentService {

    public void payBill(WithdrawableAccount account, double amount) {

        account.withdraw(amount);

        System.out.println("Bill payment successful");
    }
}
