package com.exampl.guru.factoryMetod.user;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Send push notification");
    }
}
