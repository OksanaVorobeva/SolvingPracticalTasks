package com.exampl.taskGuru.prt4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class  DataTest {
    public static void main(String[] args) {
        LocalDateTime date1 =LocalDateTime.of(1982,8,20,1,1,1);
        LocalDateTime date2 =LocalDateTime.of(1980,7,14,1,1,1);

        System.out.println(date1.format(DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MM-uuuu")));

        System.out.println(date2.minusYears(date1.getYear()).getYear());
        System.out.println(Duration.between(date1, date2).toDays());
    }
}
