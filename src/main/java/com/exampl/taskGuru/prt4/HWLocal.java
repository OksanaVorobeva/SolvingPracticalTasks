package com.exampl.taskGuru.prt4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HWLocal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int year =Year.now().getValue();
        YearMonth yearMonth = YearMonth.of(year, month);

       for (int i = 0; i <= yearMonth.lengthOfMonth(); i++) {
           System.out.println(LocalDate.of(year,month,i).format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
       }

      Scanner scanner2 = new Scanner(System.in);
       long dayNum = scanner2.nextInt();
        ZoneId zone1= ZoneId.of("Asia/Yerevan");
        LocalDateTime dateYerevanNow = LocalDateTime.now(zone1);
       LocalDateTime dateBeforeDayNow = dateYerevanNow.minusDays(dayNum);
        System.out.println(dateBeforeDayNow.format(DateTimeFormatter.ofPattern("dd MMMM uuuu HH:mm")));

    }
}
