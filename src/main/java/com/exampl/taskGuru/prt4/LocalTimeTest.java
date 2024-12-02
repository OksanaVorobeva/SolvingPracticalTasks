package com.exampl.taskGuru.prt4;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime localTimeTest = LocalTime.now();
        System.out.println(localTimeTest);

        LocalTime specificTime   = LocalTime.of(23,15,11,22);
        System.out.println(specificTime);

        LocalTime sec2000=LocalTime.ofSecondOfDay(2000);
        System.out.println(sec2000);
    }
}
