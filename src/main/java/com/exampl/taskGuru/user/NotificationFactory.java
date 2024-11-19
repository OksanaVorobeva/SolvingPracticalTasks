package com.exampl.taskGuru.user;

public class NotificationFactory {
    public Notification creatNotification(String channel) {
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel" + channel);
        }
    }

}
