package com.exampl.arrayCollection;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task103 {
    //Создание потока из массива

    public static void main(String[] args) {
        String[] arr = {"One", "Two", "Three", "Four", "Five"};
        Stream<String> stream1 = Arrays.stream(arr);
        Stream<String> stream2 = Arrays.stream(arr, 0, 2);
        Stream<String> stream3 = Arrays.asList(arr).stream();
        Stream<String> stream4 = Arrays.asList(arr).subList(0, 2).stream();
        Stream<String> stream5 = Stream.of(arr);
        Stream<String> stream6 = Stream.of("One", "Two", "Three");
        String[] array = stream1.toArray(String[]::new);

        int[] ints = {2, 3, 4, 1};
        IntStream intStream1 = Arrays.stream(ints);
        IntStream intStream2 = IntStream.of(ints);
        IntStream intStream3 = IntStream.range(0, ints.length);
        IntStream intStream4 = IntStream.rangeClosed(0, ints.length);
        int[] intArray1 = intStream1.toArray();
        int[] intArray2 = intStream4.mapToObj(i -> i).mapToInt(j -> j).toArray();
    }
}
