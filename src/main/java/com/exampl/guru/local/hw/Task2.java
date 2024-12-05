package com.exampl.guru.local.hw;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner2 = new Scanner(System.in);
        long dayNum = scanner2.nextInt();
        ZoneId zone1= ZoneId.of("Asia/Yerevan");
        LocalDateTime dateYerevanNow = LocalDateTime.now(zone1);
        LocalDateTime dateBeforeDayNow = dateYerevanNow.minusDays(dayNum);
        System.out.println(dateBeforeDayNow.format(DateTimeFormatter.ofPattern("dd MMMM uuuu HH:mm")));

    }
}
