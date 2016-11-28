package ru.sbrf.model;

/**
 * Created by Wais on 28.11.2016.
 */
public class Account {

    private final long accountId;
    private final String login;
    private final String password;
    private final UserData userData;

    public Account(long accountId, String login, String password) {
        this.accountId = accountId;
        this.login = login;
        this.password = password;
        userData = new UserData();
    }


}
