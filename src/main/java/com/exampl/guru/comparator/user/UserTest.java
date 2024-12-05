package com.exampl.guru.comparator.user;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Pavel", 25));
        users.add(new User("Olga", 80));
        users.add(new User("Olga", 28));
        users.add(new User("Vanya", 4));
        System.out.println(users);
        UserNameComparator userNameComparator = new UserNameComparator();
        users.sort(userNameComparator);
        System.out.println(users);
        UserAgeComparator userAgeComparator = new UserAgeComparator();
        users.sort(userAgeComparator);
        System.out.println(users);
        users.sort(userNameComparator.thenComparing(userAgeComparator));
        System.out.println(users);
    }
}
