package com.exampl.guru.classes;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {10, 3, 4, 3, 8, 9};
       // System.out.println(Arrays.toString(bubbleSort(arr)));
      //System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current<arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i];
            int minId=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<min) {
                    min=arr[j];
                    minId=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[minId]=temp;
        }
        return arr;
    }

}
