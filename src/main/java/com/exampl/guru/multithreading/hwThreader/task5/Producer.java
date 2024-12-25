package com.exampl.guru.multithreading.hwThreader.task5;

import com.exampl.guru.multithreading.hwThreader.task5.Store;

import java.util.Random;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        while (store.isActive()){
            store.put(new Random().nextInt(1,10));
        }
    }
}
