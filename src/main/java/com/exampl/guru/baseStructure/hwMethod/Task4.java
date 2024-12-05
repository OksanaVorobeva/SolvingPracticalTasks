package com.exampl.guru.baseStructure.hwMethod;

import java.util.Scanner;

public class Task4 {
    //написать метод который принимает на вход число и возвращает последнуу цифру

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getLastDigit(n));
    }

    static int getLastDigit(int num) {
        return num % 10;
    }
}
