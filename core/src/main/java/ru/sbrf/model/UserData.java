package ru.sbrf.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;


@Entity(name = "USERDATA")
public class UserData implements Serializable {
    private static final long serialVersionUID = 3931814872085163347L;

    @Column(name = "account_id", length = 128, nullable = false)
    private Long accountId;
    @Column(name = "first_name", length = 128, nullable = false)
    private String firstName;
    @Column(name = "second_name", length = 128, nullable = false)
    private String secondName;
    @Column(name = "last_name", length = 128, nullable = false)
    private String lastName;
    @Column(name = "birth_day")
    private Date birthday;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "birth_day")
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
        this.birthday = birthday;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addGroup(Long groupId) {
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

