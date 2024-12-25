package com.exampl.guru.multithreading.hwThreader;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(new TreadTask4());
            t1.start();
            t1.join();
        }

    }
}

class TreadTask4 extends Thread {

    public void print() throws InterruptedException {
        System.out.println(TreadTask4.currentThread().getName());
        Thread.sleep(2000);
    }

    @Override
    public void run() {

        try {
            print();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
