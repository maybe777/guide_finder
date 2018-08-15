package com.guide_finder.model.user;

import com.guide_finder.enums.Sex;

/**
 * Created by Dmitry on 15.08.2018.
 */
public abstract class User {

    private String login;
    private String firstName;
    private String lastName;
    private String password;
    private int age;
    private Sex sex;
    private String phone;
    private String email;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {

        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }


}
