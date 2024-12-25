package com.exampl.guru.multithreading.hwThreader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        Generator g = new Generator(list);
        Thread thread1 = new Thread(g);
        Thread thread2 = new Thread(g);
        Thread thread3 = new Thread(g);
        Thread thread4 = new Thread(g);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(list);
        System.out.println(list.size());
    }
}

class Generator extends Thread {
    private List<Integer> list;

    public Generator(List<Integer> list) {
        this.list = list;
    }


    public synchronized void add() {
        synchronized (list) {
            Random random = new Random();
            for (int i = 0; i < 25; i++) {
                list.add(random.nextInt(10));
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public void run() {
        add();
    }
}

