package com.exampl.guru.baseStructure.conditional;

import java.util.Scanner;

public class Task3 {
    //Написать метод, который выводит расписание на неделю.Задать на вход в метод порядковый номер дня недели
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        printTasks(day);
    }

    public static void printTasks(int day) {
        switch (day) {
            case 1:
                System.out.println("Task monday");
                break;
            case 2:
                System.out.println("Task tuesday");
                break;
            case 3:
                System.out.println("Task wednesday");
                break;
            case 4:
                System.out.println("Task thursday");
                break;
            case 5:
                System.out.println("Task friday");
                break;
            case 6:
                System.out.println("Task saturday");
                break;
            case 7:
                System.out.println("Task sunday");
                break;
            default:
                System.out.println("Wrong day");
        }
    }
}
