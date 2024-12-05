package com.exampl.guru.baseStructure.hwMethod;

import java.util.Scanner;

public class Task7 {
    //Написать метод, принимающий на вход координаты двух точек и возвращает длину отрезка между этими точками
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println(getLength(x1, y1, x2, y2));
    }
    public static double getLength(int x1, int y1, int x2, int y2) {
        return Math.hypot(x2-x1,y2-y1);
    }
}
