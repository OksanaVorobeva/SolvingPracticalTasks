package com.exampl.guru.baseStructure.cycles;

public class Task1 {
    //Вычислить факториал чисел от 1 до 10
    public static void main(String[] args) {
        int result =1;
        for (int i = 1; i <= 10; i++) {
            result=result*i;
        }
        System.out.println(result);
    }
}
