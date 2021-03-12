public class Account {
    private String AccountName;
    private String password;
    private String email;
    private String phone;
    private boolean needVerify;
    private boolean lockStatus;

    public Account(String pName, String pPassword, String pEmail, String pPhone){
        AccountName = pName;
        password = pPassword;
        email = pEmail;
        phone = pPhone;
        needVerify = true;
        lockStatus = true;
    }

    public String getAccountName() {
        return AccountName;
    }

    public String getPassword() {
        return password;
    }

    public boolean getLockStatus() {
        return lockStatus;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean getNeedVerify() {
        return needVerify;
    }

    public void setAccountNumber(String accountName) {
        AccountName = accountName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNeedVerify(boolean needVerify) {
        this.needVerify = needVerify;
    }

    public void setLockStatus(boolean lockStatus) {
        this.lockStatus = lockStatus;
    }


}
