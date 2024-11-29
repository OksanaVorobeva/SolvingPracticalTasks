package com.exampl.taskGuru.pr3.user2;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String login;
    private String password;
    private LocalDate creatDate;

    public User(String login, String password, LocalDate creatDate) {
        this.login = login;
        this.password = password;
        this.creatDate = creatDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(LocalDate creatDate) {
        this.creatDate = creatDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(creatDate, user.creatDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, creatDate);
    }

    @Override
    public String toString() {
        return "User{" +
               "login='" + login + '\'' +
               ", password='" + password + '\'' +
               ", creatDate=" + creatDate +
               '}';
    }
}
