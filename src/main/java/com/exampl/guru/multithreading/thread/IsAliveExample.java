package com.exampl.guru.multithreading.thread;

public class IsAliveExample {
    public static void main(String[] args) throws InterruptedException {
        RunnableExample runnableExample = new RunnableExample("1");
        Thread thread = new Thread(runnableExample);
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println(thread.isAlive());
        thread.join();
        System.out.println(thread.isAlive());


    }
}
