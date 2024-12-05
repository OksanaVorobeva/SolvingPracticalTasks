package com.exampl.guru.baseStructure.conditional;

import java.util.Scanner;

public class Task5 {
    //Вывести на экран один или два корня
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        printRootsCount(a, b, c);
    }
    static void printRootsCount(int a, int b, int c) {
        double d =Math.pow(b,2)-4*a*c;
        if (d>0){
            System.out.println((-b-Math.sqrt(d))/(2*a));
            System.out.println((-b+Math.sqrt(d))/(2*a));
        } else if (d==0) {
            System.out.println(-b/(2*a));
        }else {
            System.out.println("Not a root");
        }
    }
}
