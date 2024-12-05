package com.exampl.guru.local.lesson;

import java.time.*;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        today=LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(today);

        LocalDateTime randTime=LocalDateTime.of(2017, Month.APRIL,9,
                11,6,22);
        System.out.println(randTime);

        LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(2000,0, ZoneOffset.UTC);
        System.out.println(dateFromBase);

        ZoneId zone1= ZoneId.of("Asia/Kolkata");
        ZoneId zone2= ZoneId.of("Asia/Tokyo");
        System.out.println(zone1);
        LocalTime time1=LocalTime.now(zone1);
        System.out.println(time1);
        LocalTime time2=LocalTime.now(zone2);
        System.out.println(time2);
    }
}
