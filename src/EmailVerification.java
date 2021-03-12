import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;


public class EmailVerification {
    private String userEmail;
    private String senderEmail;
    private int verifyCode;

    public EmailVerification(String pEmail, int pCode) {
        senderEmail = "iantsai.edu@gmail.com";
        userEmail = pEmail;
        verifyCode = pCode;
    }

    public void sendEmail(){
        String to = userEmail;

        // Sender's email ID needs to be mentioned
        String from = senderEmail;
        // Assuming you are sending email from localhost
        String host = "localhost";
        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.setProperty("mail.smtp.host", host);
        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("Please Verify Your Account!");

            // Now set the actual message
            message.setText("Your verification code is: " + verifyCode);

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }


    public int getVerifyCode() {
        return verifyCode;
    }
}
