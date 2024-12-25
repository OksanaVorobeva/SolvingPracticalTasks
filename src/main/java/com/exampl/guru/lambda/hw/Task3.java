package com.exampl.guru.lambda.hw;

import java.util.Random;
import java.util.function.Supplier;

public class Task3 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> new Random().nextInt(0,10);
        System.out.println(supplier.get());
    }

}
