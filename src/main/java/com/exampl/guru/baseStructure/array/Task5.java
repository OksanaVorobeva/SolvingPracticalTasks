package com.exampl.guru.baseStructure.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    //удалить локальные максимумы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeLocalMax(array)));
    }

    public static int[] removeLocalMax(int[] array) {
        int j=0;
        if (array[j]<array[j+1]) {
            j++;
        }
        for (int i = j; i < array.length-1; i++) {
                if (array[i]<array[i-1]||array[i]<array[i+1]) {
                    array[j++] = array[i];
                }
        }
        if (array[array.length-1]<array[array.length-2]) {
            array[j++] = array[array.length-1];
        }
        return Arrays.copyOf(array, j);
    }
}
