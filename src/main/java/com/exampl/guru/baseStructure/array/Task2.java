package com.exampl.guru.baseStructure.array;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    //Найти максимальный элемент и выведете его индекс
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int max =0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = i;
            }
        }
        System.out.println(count);
    }
}
