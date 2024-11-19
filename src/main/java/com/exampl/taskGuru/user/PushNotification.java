package com.exampl.taskGuru.user;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Send push notification");
    }
}
