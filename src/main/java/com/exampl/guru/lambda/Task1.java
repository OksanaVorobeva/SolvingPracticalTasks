package com.exampl.guru.lambda;

public class Task1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Hello World"));
        t1.start();

    }
}
