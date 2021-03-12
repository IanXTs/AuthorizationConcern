import java.security.SecureRandom;
import java.util.ArrayList;

public class AuthorizationSystem implements  Reuse_Authorization{
    private int systemID;
    private ArrayList<Account> RegisteredAccount;

    public AuthorizationSystem(int pID){
        systemID = pID;
    }

    public void registerAccount(String pName, String pPassword, String pEmail, String pPhone){
        Account newAccount = new Account(pName, pPassword, pEmail, pPhone);
        RegisteredAccount.add(newAccount);
    }

    public void launchVerification(String aAccountName){

    }

    @Override
    public void emailVerify(Account pAccount, int codeEntered){
        int code = generateVerifyCode();
        EmailVerification e = new EmailVerification(pAccount.getEmail(), code);
        e.sendEmail();
        //prompt enterCode UI
        if(codeEntered == e.getVerifyCode()){
            //unlock account
            pAccount.setLockStatus(false);
        } else {
            pAccount.setLockStatus(true);
            //prompt wrong code UI
            new failureException();
        }
    }

    @Override
    public void smsVerify(Account pAccount, int codeEntered){
        int code = generateVerifyCode();
        SMSVerification e = new SMSVerification(pAccount.getPhone(), code);
        e.sendSMS();
        if(codeEntered == e.getVerifyCode()){
            //unlock account
            pAccount.setLockStatus(false);
        } else {
            pAccount.setLockStatus(true);
            //prompt wrong code UI
            new failureException();
        }
    }


    public int generateVerifyCode(){
        SecureRandom random = new SecureRandom();
        int verificationCode = random.nextInt(100000);
        return verificationCode;
    }

}
