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
    private ArrayList<Chat> friendChats;

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

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<Long> getGroups() {
        return groups;
    }

    public ArrayList<Chat> getFriendChats() {
        return friendChats;
    }
}
