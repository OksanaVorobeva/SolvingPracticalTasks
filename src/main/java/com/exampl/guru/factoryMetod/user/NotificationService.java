package com.exampl.guru.factoryMetod.user;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.creatNotification("SMS");
        notification.notifyUser();

    }
}
