package com.exampl.guru.baseStructure.conditional;

import java.util.Scanner;

public class Task4 {
    //Задать цело число в виде переменной, это число -сумма денег в рублях
    //Ввывести число на экран,добавив к нему слово рублей в правильном падеже

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        printCuirsiveSum(amount);
    }

    public static void  printCuirsiveSum(int amount) {
        if (amount%10==0||amount%10>=5||amount<=14) {
            System.out.println(amount+" рублей");
        } else if (amount%10==1) {
            System.out.println(amount+" рубль");
        }else {
            System.out.println(amount +" рубля");
        }
    }
}
