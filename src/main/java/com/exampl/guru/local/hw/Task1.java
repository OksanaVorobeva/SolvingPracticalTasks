package com.exampl.guru.local.hw;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int year = Year.now().getValue();
        YearMonth yearMonth = YearMonth.of(year, month);

        for (int i = 0; i <= yearMonth.lengthOfMonth(); i++) {
            System.out.println(LocalDate.of(year,month,i).format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
        }

    }
}
