public interface Reuse_Authorization {
    void emailVerify(Account pAccount, int codeEntered);

    void smsVerify(Account pAccount, int codeEntered);

}
