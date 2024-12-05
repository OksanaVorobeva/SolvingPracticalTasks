package com.exampl.guru.classes.lessonClasses.hwClass.clock;

public class Clock {
    private int alarmHouse;
    private int alarmMinutes;

    public String setAlarm(int hour, int minute) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59) {
            alarmHouse = hour;
            alarmMinutes = minute;
            return "Alarm  is Set";
        }
        return "Alarm isn't Set";
    }

    public String checkAlarm(int hour, int minute) {
        if (alarmHouse == hour && alarmMinutes == minute) {
            return "Chine";
        }
        return "";
    }

    public int checkTimeCount(int hour, int minute) {
        if(minute==0){
            return hour>12?hour-12:hour;
        }
        if(minute%15==0){
            return 1;
        }
        return 0;
    }
}
