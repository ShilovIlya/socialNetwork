package ru.sbrf.model;

import java.util.Date;

/**
 * Created by Wais on 28.11.2016.
 */
public class UserData {

    private String firstName;
    private String secondName;
    private String lastName;
    private Date birthday;
    private String city;
    private String country;

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
}
