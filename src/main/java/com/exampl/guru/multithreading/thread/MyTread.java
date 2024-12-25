package com.exampl.guru.multithreading.thread;

public class MyTread implements Runnable {
    private int counter;
    private static int globalCounter;

    @Override
    public void run() {
        while (counter < 20) {
            counter++;
            globalCounter++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " counter" + counter+"globalCounter"+globalCounter);
        }
    }
}

class TestMyThread {
    public static void main(String[] args) {
        new Thread(new MyTread()).start();
        new Thread(new MyTread()).start();
        new Thread(new MyTread()).start();

    }
}
