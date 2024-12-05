package com.exampl.guru.baseStructure.conditional;

import java.util.Scanner;

public class Task2 {
    //имеется прямоугольное отверстие размером a и b. Определить можно ли его полностью закрыть круглой картонкой
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(isCover(a,b,r));
    }

    public static boolean isCover(int a, int b, int r) {
        double d=Math.hypot(a,b);
        return d<=2*r;
    }
}
