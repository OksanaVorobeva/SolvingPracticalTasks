package com.exampl.taskGuru.user;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification");
    }
}
