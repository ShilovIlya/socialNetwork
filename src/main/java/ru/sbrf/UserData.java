package ru.sbrf;

import java.util.ArrayList;
import java.util.Date;

public class UserData {

    private Long accountId;
    private String firstName;
    private String secondName;
    private String lastName;
    private Date birthday;
    private String city;
    private String country;
    private ArrayList<Long> groups;

    public UserData(Long accountId) {
        this.accountId = accountId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday) {
        //TODO: check Date
        this.birthday = birthday;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addGroup(Long groupId) {
        //TODO: check group unique
        groups.add(groupId);
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
