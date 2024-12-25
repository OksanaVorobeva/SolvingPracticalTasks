package com.exampl.guru.multithreading.hwThreader.task5;



public class Consumer implements Runnable {

    private  final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {
      while (store.isActive()){
          store.get();
      }
    }
}
