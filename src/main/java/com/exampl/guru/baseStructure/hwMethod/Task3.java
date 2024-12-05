package com.exampl.guru.baseStructure.hwMethod;

import java.util.Scanner;

public class Task3 {
    //Написать метод, который принимает на вход значения промежутка времени в секундах
    //Метод вывлдит на экран этот промежуток времени в виде минут и секунд, суток и недель
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

        }
    }

    private static void printFormattedDate(int number){
        int weekSec=7*24*60*60;
        int weeks=number/weekSec;

        int daysSec=24*60*60;
        int days=(number-weekSec*weeks)/daysSec;

        int hoursSec=60*60;
        int hours=(number-weeks*weekSec-days*daysSec)/hoursSec;

        int minSec=60;
        int minutes =(number-weeks*weekSec-days*daysSec-hours*hoursSec)/minSec;

        int second =number%60;

        System.out.println(weeks+days+hours+minutes+second);
    }
}
