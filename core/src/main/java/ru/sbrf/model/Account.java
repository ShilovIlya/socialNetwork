package ru.sbrf.model;

import javax.persistence.*;

@Entity(name = "ACCOUNTS")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "accountId", unique = true, nullable = false)
    private long accountId;

    @Column(name = "login", length = 128, unique = true, nullable = false)
    private String login;
    @Column(name = "password", length = 128, nullable = false)
    private String password;

    private UserData userData;

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

    public void setUserData(UserData userData) {
        this.userData = userData;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
