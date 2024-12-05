package com.exampl.guru.baseStructure.hwMethod;

import java.util.Scanner;

public class Task5 {
    //Написать метод, принимающий на вход четырехзначное число abcd и возвращает сумму ab+cd

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calculate(n));
    }

    public static int calculate(int number){
        return  number%100+number/100;
    }
}
