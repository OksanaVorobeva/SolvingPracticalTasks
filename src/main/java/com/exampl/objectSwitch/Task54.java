package com.exampl.objectSwitch;

import java.util.Date;

public class Task54 {
    //Переопределение метода toString
    public static void main(String[] args) {

    }

}

class User{
    private final String nickname;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final Date created;

    public User(String nickname, String password, String firstname, String lastname, String email, Date created) {
        this.nickname = nickname;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.created = created;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "User{" +
               "nickname='" + nickname + '\'' +
               ", firstname='" + firstname + '\'' +
               ", lastname='" + lastname + '\'' +
               ", email='" + email + '\'' +
               ", created=" + created +
               '}';
    }
}