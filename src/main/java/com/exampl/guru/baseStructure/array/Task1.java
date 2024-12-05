package com.exampl.guru.baseStructure.array;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    //Создайте переменную для массива из 10 элементов
    //Заполните его произвольными значениями
    //Выведите на экран элемпенты стоящие на четных позициях
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

