package com.exampl.taskGuru.pr3.user2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Manager {
    private static Map<String, User> userMap = new HashMap<>();

    boolean addUser(User user) {
        if (userMap.containsKey(user.getLogin())) {
            System.out.println("User already exists");
            return false;
        } else {
            System.out.println("Saving user");
            userMap.put(user.getLogin(), user);
            return true;
        }
    }

    boolean login(String login, String password) {
        if (!userMap.containsKey(login)) {
            System.out.println("User doesn't exist");
            return false;
        } else if (userMap.get(login).getPassword().equals(password)) {
            System.out.println("Logged in");
            return true;
        } else {
            System.out.println("Wrong password");
            return false;
        }
    }

    boolean deleteUser(String login) {
        if (userMap.containsKey(login)) {
            userMap.remove(login);
            System.out.println("Logged delete");
            return true;
        } else {
            System.out.println("User doesn't exist");
            return false;
        }
    }

    void getAllUsers() {
        System.out.println(userMap.keySet());
    }

    void getAllUsers(String sortCriterion) {
        switch (sortCriterion) {
            case "login":
                Map<String, User> sortedByLogin = new TreeMap<>(userMap);
                for (Map.Entry<String, User> entry : sortedByLogin.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                break;
            case "date":
                UserDateComparator userDateComparator = new UserDateComparator();
                List<User> sotedByDateList = new ArrayList<>(userMap.values());
                sotedByDateList.sort(userDateComparator);
                for (User user : sotedByDateList) {
                    System.out.println(user);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sortCriterion);
        }
    }

    boolean editUser(User user) {
        if (!userMap.containsKey(user.getLogin())) {
            System.out.println("User doesn't exist");
            return false;
        }else {
            userMap.put(user.getLogin(), user);
            System.out.println("Edited user");
            return true;
        }
    }
}
