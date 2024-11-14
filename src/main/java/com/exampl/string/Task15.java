package com.exampl.string;

import java.util.Arrays;
import java.util.Comparator;

public class Task15 {
    //Сортировка массива строк по длине

    public static void main(String[] args) {
        String[] str = {"ddd", "aksjdy", "hh"};
        //Arrays.sort(str, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
        // Arrays.sort(str, Comparator.comparingInt(String::length));
        str = Arrays.stream(str)
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);


        System.out.println(Arrays.toString(str));
    }


}
