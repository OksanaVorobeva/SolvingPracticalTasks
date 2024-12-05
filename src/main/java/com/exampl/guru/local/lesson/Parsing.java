package com.exampl.guru.local.lesson;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Parsing {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        //свой фоомт
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MM::uuuu")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));

        Instant timestamp = Instant.now();
        System.out.println(timestamp);

    }
}
