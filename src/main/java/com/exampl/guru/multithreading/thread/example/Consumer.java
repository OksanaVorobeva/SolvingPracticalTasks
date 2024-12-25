package com.exampl.guru.multithreading.thread.example;

public class Consumer implements Runnable {
    private Store store;
    public Consumer(Store store) {
        this.store = store;
    }
    public void run() {
        for (int i = 0; i < 6; i++) {
            store.get();
        }
    }
}
