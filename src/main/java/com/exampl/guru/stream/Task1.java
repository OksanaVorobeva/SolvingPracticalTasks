package com.exampl.guru.stream;

import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        long res= Stream.of("a1","a2","a3").filter(a->a.equals("a1")).count();
        System.out.println(res);
    }
}
