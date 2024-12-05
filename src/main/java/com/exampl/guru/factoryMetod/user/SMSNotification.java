package com.exampl.guru.factoryMetod.user;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification");
    }
}
