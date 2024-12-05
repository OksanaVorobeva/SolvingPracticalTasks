package com.exampl.guru.baseStructure.array;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    //исключить одинаковые элементы массива
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int max =0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        int []sortedArr=deleteDuplicates(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] deleteDuplicates(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length-count; i++) {
            for (int j = i+1; j < array.length-count; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[array.length-1]-count;
                    count++;
                }
            }
        }
        int[] newArray;
        newArray= Arrays.copyOfRange(array,0,array.length-count);
        return newArray;
    }
}
