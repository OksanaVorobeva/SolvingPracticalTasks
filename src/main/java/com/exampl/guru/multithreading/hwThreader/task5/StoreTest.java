package com.exampl.guru.multithreading.hwThreader.task5;



public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        Producer producer = new Producer(store);
        Producer producer2 = new Producer(store);
        Producer producer3 = new Producer(store);
        Consumer consumer = new Consumer(store);
        Consumer consumer2 = new Consumer(store);

        new Thread(producer).start();
        new Thread(producer2).start();
        new Thread(producer3).start();
        new Thread(consumer).start();
        new Thread(consumer2).start();

    }
}
