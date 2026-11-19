package dip.badDesign;

public class OrderService {

    //private EmailService emailService = new EmailService();

    private SmsService smsService = new SmsService();

    public void placeOrder() {

        System.out.println("Order placed");

//        emailService.sendEmail(
//                "customer@gmail.com",
//                "Your order has been placed"
//        );

        smsService.sendSms("9876543210",
                "Your order has been placed");
    }
}
