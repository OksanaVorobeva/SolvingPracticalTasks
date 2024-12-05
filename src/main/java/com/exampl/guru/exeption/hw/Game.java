package com.exampl.guru.exeption.hw;

import java.util.Random;
import java.util.Scanner;

class GameNumber {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;
        int randomNumber = new Random().nextInt(minNumber, maxNumber + 1);
        int numberOfAttempts = 5;
        int number;
        System.out.println("Система загадала число в интервале от " + maxNumber + " до" + maxNumber);
        System.out.println("Вам дано " + numberOfAttempts + " попыток чтобы отгадать число");
        System.out.println("_______________________");
        while (true) {
            System.out.println("Пожалуйста введите число от " + minNumber + " до" + maxNumber);

            while (true) {
                String input = new Scanner(System.in).nextLine();

                try {
                    number = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число");
                    continue;
                }
                if (number < minNumber || number > maxNumber) {
                    System.out.println("Число введено некорректно");
                    continue;
                }
                break;
            }
            if (number == randomNumber) {
                System.out.println("Угадано");
                break;
            }
            --numberOfAttempts;
            if (numberOfAttempts == 0) {
                System.out.println("Вы проиграли");
                break;
            }
            if (number<randomNumber) {
                System.out.println("Число больше");
            }else {
                System.out.println("Число меньше ");
            }

            System.out.println("_______________________");
            System.out.println("Кол-во оставшихся попыток " +numberOfAttempts);
            System.out.println("_______________________");
        }
    }
}