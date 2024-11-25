package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Task105 {
    //Инвертирование массива
    public static void main(String[] args) {
        int[] integers = {-1, 2, 3, 1, 4, 5, 3, 2, 22};
        reverse(integers);
        System.out.println(Arrays.toString(integers));
        int[] reversed = IntStream.rangeClosed(1,integers.length)
                .map(i->integers[integers.length-i])
                .toArray();
        System.out.println(Arrays.toString(reversed));

        Melon[] melons = {
                new Melon("Grenshaw", 2000),
                new Melon("Gac", 1200),
                new Melon("Bitter", 2200),
        };
        reverse(melons);
        System.out.println(Arrays.toString(melons));
        Collections.reverse(Arrays.asList(melons));
        System.out.println(Arrays.toString(melons));
        Melon[] reversred =IntStream.rangeClosed(1, melons.length)
                .mapToObj(i->melons[melons.length-i])
                .toArray(Melon[]::new);
        System.out.println(Arrays.toString(reversred))  ;

    }

    public static void reverse(int[] array) {
        for (int leftHead = 0,rightHead =array.length-1;
             leftHead < rightHead ; leftHead++, rightHead--) {
            int element = array[leftHead];
            array[leftHead] = array[rightHead];
            array[rightHead] = element;
        }
    }

    public static <T> void reverse(T[] array) {
        for (int leftHead = 0,rightHead =array.length-1;
        leftHead < rightHead ; leftHead++, rightHead--) {
            T element = array[leftHead];
            array[leftHead] = array[rightHead];
            array[rightHead] = element;
        }
    }

}
