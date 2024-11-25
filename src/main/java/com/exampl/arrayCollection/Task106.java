package com.exampl.arrayCollection;

import java.util.Arrays;

public class Task106 {
    //Заполнение и настройка массива
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        Arrays.fill(arr, 1);
        int[] arr2 = new int[10];
      /*  for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i-1]+1;
        }*/
        Arrays.setAll(arr2,t->{
            if (t==0){
                return arr2[t];
            }else {
                return arr2[t-1]+1;
            }
        });
        Arrays.parallelSetAll(arr2,t->{
            if (arr2[t]%2==0){
                return arr2[t]*arr2[t];
            }else {
                return arr2[t]-1;
            }
        });
        Arrays.parallelPrefix(arr2,(t,q)->t+q);
        System.out.println(Arrays.toString(arr2));
    }
}
