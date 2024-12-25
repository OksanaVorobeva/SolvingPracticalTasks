package com.exampl.guru.multithreading.thread.example;

public class Store {
    private int item;

    public synchronized void  put(){
        while (item>=3){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        item++;
        System.out.println("Put: in the store: " + item);
        notify();
    }

    public synchronized  void  get(){
        if (item<1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        item--;
        System.out.println("Get: in the store: " + item);
        notify();
    }

}
