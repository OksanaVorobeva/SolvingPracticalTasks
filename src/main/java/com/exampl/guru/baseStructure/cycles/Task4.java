package com.exampl.guru.baseStructure.cycles;

import java.util.Scanner;

public class Task4 {
    //Вывести на экран минимум количество пицц, чтобы у всех было одинаковое кол-во кусков и ниодного не осталось лишнего

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNum = scanner.nextInt();
        int peaceNum = scanner.nextInt();
        int pizzaNum = 1;
        while ((peaceNum*peaceNum)%peopleNum!=0){
            peaceNum++;
        }
        System.out.println(peaceNum);
    }
}
