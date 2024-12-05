package com.exampl.guru.baseStructure.array;

import java.util.Arrays;

public class Task3 {
    //Создать двумерный массив и заполнить его бабочкой
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        fillArraysAsButterfly(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static void fillArraysAsButterfly(int[][] arr) {
        for (int i = 0; i <=arr.length / 2; i++) {
            for (int j = 0; j <= arr[i].length / 2; j++) {
                if (j < i) {
                    arr[i][j] = 0;
                    arr[arr.length - i - 1][j] = 0;
                    arr[i][arr[i].length - j - 1] = 0;
                    arr[arr.length - i - 1][arr[i].length - j - 1] = 0;
                } else {
                    arr[i][j] = 1;
                    arr[arr.length - i - 1][j] = 1;
                    arr[i][arr[i].length - j - 1] = 1;
                    arr[arr.length - i - 1][arr[i].length - j - 1] = 1;
                }
            }
        }
    }
}
