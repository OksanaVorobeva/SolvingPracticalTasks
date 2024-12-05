package com.exampl.guru.classes.lessonClasses.hwClass.clock;

public class TestClock {
    public static void main(String[] args) {
        Clock clock = new Clock();
        System.out.println(clock.setAlarm(55,108));
        System.out.println(clock.setAlarm(12,0));
        System.out.println(clock.checkAlarm(8,55));
        System.out.println(clock.checkAlarm(12,0));
        System.out.println(clock.checkTimeCount(17,15));
        System.out.println(clock.checkTimeCount(17,00));
        System.out.println(clock.checkTimeCount(17,01));

    }
}
