package com.exampl.arrayCollection;

import java.util.Arrays;

public class Task108 {
    //Изменение размера массива
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 12, 2, 1, 4};
        System.out.println(Arrays.toString(add(integers,5)));
        System.out.println(Arrays.toString(remove(integers)));
        System.out.println(Arrays.toString(resize(integers,5)));


    }
    public static  int[] add(int[] arr,int item){
        int[] newArr = Arrays.copyOf(arr,arr.length+1);
        newArr[newArr.length-1] = item;
        return newArr;
    }
    public static int[] remove(int[]arr){
        int[] newArr = Arrays.copyOf(arr,arr.length-1);
        return newArr;
    }
    public static  int[] resize(int[] arr,int newLength){
        int[] newArr = Arrays.copyOf(arr,arr.length+newLength);
        return newArr;
    }
}
