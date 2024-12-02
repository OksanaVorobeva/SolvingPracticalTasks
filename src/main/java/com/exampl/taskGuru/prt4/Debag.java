package com.exampl.taskGuru.prt4;

import java.util.Arrays;
import java.util.Random;

public class Debag {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(50)-10;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeLocalMax(arr)));

    }

    static int[] removeLocalMax(int[] arr) {
        int[] newArray = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                if (arr[i]<arr[i+1]){
                    newArray[count++]=arr[i];
                }
            }else if(i==arr.length-1){
                if (arr[i]<arr[i-1]){
                    newArray[count++]=arr[i];
                }
            }else {
                if (arr[i]<arr[i-1]||arr[i]<arr[i+1]){
                    newArray[count++]=arr[i];
                }
            }
        }
        return Arrays.copyOf(newArray,count);
    }
}
