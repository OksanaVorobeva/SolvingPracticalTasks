package com.exampl.guru.baseStructure.hwMethod;

import java.util.Scanner;

public class Task6 {
    //Написать метод, принимающий на вход 5-ти значное число и возвращает 3-ю цифру
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getThirdDigit(n));
    }

    public static int getThirdDigit(int num) {
        return num / 100%10;
    }
}
