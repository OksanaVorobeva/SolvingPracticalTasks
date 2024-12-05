package com.exampl.guru.factoryMetod.user;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Send email");
    }
}
