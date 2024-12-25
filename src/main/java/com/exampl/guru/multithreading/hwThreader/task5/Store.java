package com.exampl.guru.multithreading.hwThreader.task5;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Store {
    private final BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(200);

    private volatile int processedItems = 1;

    private volatile boolean isActive = true;

    public boolean isActive() {
        return isActive;
    }


    public  void put(Integer number) {
        try {
            queue.put(number); //блокирует если очередь полная
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public void get() {
       try {
           Integer number = queue.take();
           synchronized (this) {
               if(processedItems <= 10) {
                   System.out.println(number+": "+processedItems);
                   processedItems++;
               }else {
                   isActive = false;
               }
           }
       }catch (InterruptedException e){
           Thread.currentThread().interrupt();
       }
    }

}
