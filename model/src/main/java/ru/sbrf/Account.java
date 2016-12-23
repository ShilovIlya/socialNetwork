package ru.sbrf;

public class Account {

    private long accountId;
    private final String login;
    private final String password;
    private final UserData userData;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
        userData = new UserData(accountId);
    }


    public long getAccountId() {
        return accountId;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
}
