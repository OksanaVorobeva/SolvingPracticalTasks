package com.exampl.objectSwitch;

import java.util.Date;

/*
public class Task51 {
    //Написание немутируемого класса с помощью шаблона строитель

    public static void main(String[] args) {
        User user1 = User.getBuilder("marina", "jjjjj").build();
        User user2 = User.getBuilder("marina", "jjjjj")
                .email("jjjjj")
                .build();
        User user3= User.getBuilder("nnn","hhhh")
                .email("jjjj")
                .lastname("jjjj")
                .build();

    }


}

 final class User {
    private final String nickname;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final Date created;

    private User(UserBuilder builder) {
        this.nickname = builder.nickname;
        this.password = builder.password;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
        this.created = builder.created;
    }

    public static UserBuilder getBuilder(String nickname, String password) {
        return new User.UserBuilder(nickname, password);
    }

 static final class UserBuilder {
        private final String nickname;
        private final String password;
        private final String firstname;
        private final String lastname;
        private final String email;
        private final Date created;

        public UserBuilder(String nickname, String password) {
            this.nickname = nickname;
            this.password = password;
            this.created = new Date();
        }

        public UserBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public UserBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
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
            return new Date(created.getTime());
        }

    }
}


*/
