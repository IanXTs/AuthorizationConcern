import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSVerification {
    private String phone;
    private int verifyCode;

    public static final String ACCOUNT_SID =
            "AC540574aace381039de3fe7858d2fd6e2";
    public static final String AUTH_TOKEN =
            "f725e9a8c1b26e801aaeffd9ecdb26a0";

    public int getVerifyCode() {
        return verifyCode;
    }

    public SMSVerification(String pPhone, int pCode) {
        phone = pPhone;
        verifyCode = pCode;
    }

    public void sendSMS(){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        String sent = "Your Verification Code is " + verifyCode;
        Message message = Message
                .creator(new PhoneNumber("+14159352345"), // to
                        new PhoneNumber("+14158141829"), // from
                        sent)
                .create();
        System.out.println(message.getSid());
    }
}
