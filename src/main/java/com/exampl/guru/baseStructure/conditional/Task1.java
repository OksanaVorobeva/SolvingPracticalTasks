package com.exampl.guru.baseStructure.conditional;

import java.util.Scanner;

public class Task1 {
    //Создайте метод с одним целочисленным параметром.Метод должен определить
    //является ли последняя цифра числа семеркой и вернуть boolean значение
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isLastDigitSeven(n));
    }

    static boolean isLastDigitSeven(int num) {
        return num % 10 == 7;
    }
}
