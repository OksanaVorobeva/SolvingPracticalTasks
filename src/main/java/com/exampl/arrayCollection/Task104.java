package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.Comparator;

public class Task104 {
    //Минимальное, максимальное и среднее значения массива

    public static void main(String[] args) {
        int[] integers = {2, 3, 4, 1, -4, 6, 2};
        int maxInt1 = max(integers);
        System.out.println(maxInt1);
        int maxInt2 = Arrays.stream(integers).max().getAsInt();
        System.out.println(maxInt2);
        double avg1=average(integers);
        System.out.println(avg1);
        double avg2=Arrays.stream(integers).average().getAsDouble();
        System.out.println(avg2);

        Melon[] melons = {new Melon("Horned", 1500), new Melon("Gac", 2200),
                new Melon("Hami", 1600), new Melon("Gac", 2100)};
        Melon maxMelon1 =max(melons);
        System.out.println(maxMelon1);
        Comparator<Melon> byTape =  Comparator.comparing(Melon::getType);
        Melon maxMelon2 =max2(melons,byTape);
        System.out.println(maxMelon2);
        Melon maxMelon3=Arrays.stream(melons).max(byTape).orElseThrow();
        System.out.println(maxMelon3);
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int elem : arr) {
            max = Math.max(max, elem);
        }
        return max;
    }

    public static <T extends Comparable<T>> T max(T[] arr) {
        T max = arr[0];
        for (T elem : arr) {
            if (elem.compareTo(max) > 0) {
                max = elem;
            }
        }
        return max;
    }

    public static  <T > T max2(T[] arr,Comparator<? super T> comparator) {
        T max = arr[0];
        for(T elem:arr){
            if(comparator.compare(elem,max) > 0){
                max = elem;
            }
        }
        return max;
    }

    public static double average(int[] arr) {
        return sum(arr)/arr.length;
    }

    public static double sum(int[] arr) {
        double sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

}
