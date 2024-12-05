package com.exampl.guru.hashMap.lesson;

import java.time.LocalDate;

public class ManagerTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.addUser(new User("misha","123l54", LocalDate.of(2020,10,10)));
        manager.addUser(new User("vaniay","goule", LocalDate.now()));
        manager.addUser(new User("petr","pokemob", LocalDate.of(2021,10,10)));
        manager.addUser(new User("ira","root", LocalDate.of(2022,10,10)));
        System.out.println();
        manager.login("misha","123l54");
        System.out.println();
        manager.deleteUser("misha");
        System.out.println();
        manager.getAllUsers();
        System.out.println();
        manager.getAllUsers("login");
        System.out.println();
        manager.getAllUsers("date");
        System.out.println();
        manager.editUser(new User("vaniay","goule", LocalDate.now()));

    }
}
