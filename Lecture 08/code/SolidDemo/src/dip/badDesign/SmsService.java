package dip.badDesign;

public class SmsService {

    public void sendSms(String phone, String message) {

        System.out.println("Sending SMS to: " + phone);

        System.out.println(message);
    }
}
