package com.exampl.guru.local.lesson;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specificDate = LocalDate.of(2020, Month.APRIL, 1);
        System.out.println(specificDate);

        LocalDate epohDate = LocalDate.ofEpochDay(365);
        System.out.println(epohDate);

        LocalDate day2502017 = LocalDate.ofYearDay(2017,250);
        System.out.println(day2502017);
    }
}
